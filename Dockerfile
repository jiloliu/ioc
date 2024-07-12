FROM openjdk:21-jdk

LABEL maintainer="jiloliu.pp@gmail.com"

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]