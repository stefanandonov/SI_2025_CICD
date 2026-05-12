# Stage 1: Build
FROM gradle:7.5-jdk17 AS build

WORKDIR /app

COPY build.gradle settings.gradle ./
COPY src ./src

RUN gradle jar --no-daemon

# Stage 2: Run
FROM eclipse-temurin:21

WORKDIR /app

COPY --from=build /app/build/libs/reverse-words-app-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
