## used to print outputs
output "alb_hostname" {
  value = aws_alb.main.dns_name
}

output "name_server" {
 value=aws_route53_zone.config_server.name_servers
}