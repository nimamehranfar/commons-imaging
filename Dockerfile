# Use the base image with JDK 21
FROM eclipse-temurin:21-jdk-alpine as build

# Install Maven in the container
RUN apk update && apk add --no-cache maven

# Set the working directory
WORKDIR /app

# Copy your Maven project into the image
COPY . /app

# Run Maven build
RUN mvn clean install

# Final image
FROM eclipse-temurin:21-jdk-alpine

# Install Maven in the final image
RUN apk update && apk add --no-cache maven

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app /app

# Command to run all tests
CMD ["mvn", "test"]
