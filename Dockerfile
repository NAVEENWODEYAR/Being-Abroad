FROM ubuntu:latest
LABEL authors="Naveen Wodeyar"

FROM openjdk:21
RUN mkdir /usr/app/
COPY /target/App.jar /usr/app
WORKDIR /usr/app/
ENTRYPOINT ["java", "-jar",".jar"]