FROM openjdk:latest
COPY target/app.jar /app/app.jar
#COPY target/AppServer-1.1.jar /app/AppServer-1.1.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]