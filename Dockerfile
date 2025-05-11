# Use OpenJDK image
FROM openjdk:17

# Set workdir
WORKDIR /app

# Copy build files
COPY build/libs/reverse-words-app-1.0.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]