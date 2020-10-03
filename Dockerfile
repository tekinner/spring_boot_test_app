FROM openjdk:11

COPY build/libs/*.jar /app/app.jar
COPY src/main/resources/application.yml application.yml

CMD ["java", "-jar", "/app/app.jar" ]
