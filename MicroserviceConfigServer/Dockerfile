#FROM maven:3.5.4-jdk-8-alpine as maven

#COPY ./pom.xml ./pom.xml

#COPY ./src ./src

#RUN mvn dependency:go-offline -B

#RUN mvn package

#FROM openjdk:8u171-jre-alpine
FROM fabric8/java-alpine-openjdk11-jre

WORKDIR /MicroserviceConfigServer

#COPY --from=maven target/MicroserviceConfigServer-0.0.1-*.jar ./MicroserviceConfigServer.jar
COPY target/MicroserviceConfigServer-0.0.1-*.jar ./MicroserviceConfigServer.jar
EXPOSE 9090
CMD ["java", "-jar", "./MicroserviceConfigServer.jar"]

