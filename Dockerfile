FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG APP_JAR

COPY  ${APP_JAR} app.jar

WORKDIR /tmp

ENTRYPOINT ["java","-jar","/app.jar"]

