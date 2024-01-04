FROM ubuntu:latest
LABEL authors="Naveen Wodeyar"

ENTRYPOINT ["java", "-jar",".jar"]