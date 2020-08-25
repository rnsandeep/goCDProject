FROM java:8-jdk-alpine
COPY ./target/scala-2.11/httpakka-assembly-1.0.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "httpakka-assembly-1.0.jar"]
