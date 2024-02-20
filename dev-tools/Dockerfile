FROM maven:latest AS MAVEN_TOOL

COPY pom.xml /tmp/
COPY common-service /tmp/common-service/
COPY file-service /tmp/file-service/
COPY notification-service /tmp/notification-service/
COPY user-service /tmp/user-service/
COPY launcher /tmp/launcher/

WORKDIR /tmp/

RUN mvn clean install -Pdocker

FROM openjdk:17.0.1-jdk-slim
COPY --from=MAVEN_TOOL /tmp/launcher/target/launcher-0.0.1-SNAPSHOT.jar fin-analysis-0.0.1-SNAPSHOT.jar

ARG CONTAINER_DATASOURCE_URL
ARG DB_NAME

RUN sh -c 'touch /fin-analysis-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-Dspring.datasource.url=${CONTAINER_DATASOURCE_URL}/${DB_NAME}", "-jar","/fin-analysis-0.0.1-SNAPSHOT.jar"]