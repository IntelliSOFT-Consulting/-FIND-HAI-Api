FROM maven:3.8.3-openjdk-17-slim AS build
FROM openjdk:17-jdk-slim-buster
EXPOSE 8090
WORKDIR /findhai_javabackend
COPY .github /findhai_javabackend
ADD target/findhai-0.0.1-SNAPSHOT.jar findhai-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","target/findhai-0.0.1-SNAPSHOT.jar"]