## Defines where to store the state files
terraform {
  backend "s3" {
    bucket = "microservice-config-server-terraform-backend"  #s3 bucket needs to be created before .
    key    = "MicroserviceConfigServer_jenkins.tfstate"
    region = "us-east-1"  # variable is not allowed here
#    encrypt = true   # it will encrypt the terraform state file
#    dynamodb_table = "terraform-state-lock-dynamo"  # used to implement locking so that multiple people dont apply changes to AWS at same time
	 dynamodb_table = "terraform_lock"
    }
  }


/*resource "aws_s3_bucket" "terraform_state" {
  bucket = "microservice-config-server-terraform-backend"
  lifecycle {
		prevent_destroy = true
	}

  versioning {
		enabled = true
	}
  server_side_encryption_configuration {
		rule {
		 		apply_server_side_encryption_by_default {
				sse_algorithm = "AES256"
			}
		}
	}
}

resource "aws_dynamodb_table" "terraform_lock" {
	name= "terraform-state-locking"
	billing_mode = "PAY_PER_REQUEST"
	hash_key = "LockID"
	
	attribute {
		name = "LockID"
		type = "s"
	}
}**/


