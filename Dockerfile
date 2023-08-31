FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:resolve
COPY src .
RUN mvn -B package

FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY --from=build target/findhai-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","findhai-0.0.1-SNAPSHOT.jar"]