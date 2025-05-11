# Use OpenJDK image
FROM openjdk:17

# Set workdir
WORKDIR /app

# Copy build files
COPY build/libs/app-jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]