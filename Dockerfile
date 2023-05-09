FROM openjdk:8-jdk-slim

WORKDIR /app

COPY . /app

RUN chmod +x mvnw

RUN ./mvnw package -DskipTests

CMD ["java", "-jar", "/app/target/Spring_mock-0.0.1-SNAPSHOT.jar"]

EXPOSE 8090
