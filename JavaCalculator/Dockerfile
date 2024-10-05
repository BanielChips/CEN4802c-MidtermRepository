
FROM maven:3.9.9-eclipse-temurin-11 AS build


WORKDIR /usr/src/app


COPY pom.xml .
COPY src ./src


RUN mvn clean package -DskipTests


FROM eclipse-temurin:11-jre-slim


WORKDIR /usr/src/app


COPY --from=build /usr/src/app/target/JavaCalculator-1.0-SNAPSHOT.jar .


EXPOSE 8081


CMD ["java", "-jar", "JavaCalculator-1.0-SNAPSHOT.jar"]
