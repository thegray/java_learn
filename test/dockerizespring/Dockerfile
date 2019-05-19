FROM openjdk:8-jdk-alpine

COPY ./target/dockerizespring-1.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch dockerizespring-1.0-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","dockerizespring-1.0-SNAPSHOT.jar"]
