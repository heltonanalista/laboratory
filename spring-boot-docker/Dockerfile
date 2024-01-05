FROM eclipse-temurin:21-jre-alpine

RUN addgroup -S demo && adduser -S demo -G demo
USER demo

ARG JAR_FILE=build/libs/*.jar # docker build --build-arg JAR_FILE=build/libs/*.jar -t samples/book-service-api .
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]