FROM openjdk:8-jdk-alpine
MAINTAINER RajneeshGupta
COPY target/raj-hello-world-0.0.1-SNAPSHOT.jar raj-hello-world.jar
ENTRYPOINT ["java","-jar","/raj-hello-world.jar"]