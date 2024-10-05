# Use the official Maven image for building the application
FROM maven:3.8.6-openjdk-11 AS build

# Set the working directory
WORKDIR /usr/src/app

# Copy the pom.xml and install dependencies
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Use a smaller image for running the application
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /usr/src/app

# Copy the jar file from the build stage
COPY --from=build /usr/src/app/target/JavaCalculator-1.0-SNAPSHOT.jar .


# Expose the application port
EXPOSE 8081

# Command to run the application
CMD ["java", "-jar", "JavaCalculator.jar"]
