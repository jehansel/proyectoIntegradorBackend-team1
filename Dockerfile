# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests


# Stage 2: Run the application
FROM eclipse-temurin:21-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080

ENV SPRING_PROFILES_ACTIVE=prod

CMD ["java", "-jar", "app.jar"]