# Use an OpenJDK base image (non-Alpine version for better compatibility)
FROM openjdk:21-jdk

# Set the working directory
WORKDIR /app

# Copy the Maven wrapper and project files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download dependencies (skip tests for faster build)
RUN ./mvnw dependency:go-offline -B

# Copy the source code and package the app
COPY src/ ./src
RUN ./mvnw clean package -DskipTests

# Expose the port that Spring Boot will run on
EXPOSE 8080

# Run the Spring Boot app using the correct JAR file
CMD ["java", "-jar", "target/test-0.0.1-SNAPSHOT.jar"]
