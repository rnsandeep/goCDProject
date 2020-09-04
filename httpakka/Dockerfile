FROM java:8-jdk-alpine
COPY ./assembly_latest.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
CMD ["java", "-jar", "assembly_latest.jar"]
