FROM openjdk:8-alpine

COPY sb-docker-ready-application/target/libs-env /app/libs

COPY sb-docker-ready-application/target/libs-modules /app/libs

COPY sb-docker-ready-application/target/sb-docker-ready-application-1.0-SNAPSHOT.jar /app/run.jar

EXPOSE 8080

CMD [ "java", "-jar", "/app/run.jar" ]