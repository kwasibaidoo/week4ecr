# Use an official OpenJDK runtime as the base image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven build file
COPY pom.xml .

# Copy the Maven wrapper
COPY mvnw .
COPY .mvn .mvn

# Make Maven wrapper executable
RUN chmod +x ./mvnw

# Copy the source code
COPY src ./src

# Build the application
RUN ./mvnw package -DskipTests

# Copy the built jar file
COPY target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]