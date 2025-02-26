FROM maven:latest

LABEL authors="tonih"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

ENTRYPOINT ["Java", "-jar", "target/laskin.jar"]