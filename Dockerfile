
FROM openjdk:21
WORKDIR /app
COPY target/AikidoTracker.jar AikidoTracker.jar
ENTRYPOINT ["java", "-jar", "AikidoTracker.jar"]

