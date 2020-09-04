FROM java:8-jdk-alpine
COPY ./assembly.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
CMD ["java", "-jar", "assembly.jar"]
