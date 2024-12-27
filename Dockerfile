FROM eclipse-temurin:21-jre-alpine

COPY damri/build/libs/damri-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]