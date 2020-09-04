FROM java:8-jdk-alpine
COPY ./httpakka-assembly-${GO_PIPELINE_LABEL}.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
CMD ["sh" , "-c", "java", "-jar", "httpakka-assembly-${GO_PIPELINE_LABEL}.jar"]
