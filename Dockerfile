FROM alpine:3.14.3
COPY target/standalone /app
ENTRYPOINT ["/app/bin/java", "--module", "org.example.appserver/org.example.App"]
#./standalone/bin/java --module

##COPY target/app.jar /app/app.jar
#ENTRYPOINT ["java", "-jar", "/app/app.jar"]