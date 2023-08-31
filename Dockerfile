# Build stage
FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean install

# Final runtime stage
FROM openjdk:17-jdk-slim-buster
EXPOSE 8090
WORKDIR /app
COPY --from=build /app/target/findhai-0.0.1-SNAPSHOT.jar findhai-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","findhai-0.0.1-SNAPSHOT.jar"]