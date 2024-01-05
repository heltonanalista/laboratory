# Build Gradle
```bash
./gradlew build
``` 

# Executar o container

## Utilizando docker-compose
```bash
cd spring-boot-docker
docker-compose up
```

## Utilizando docker build
```bash
cd spring-boot-docker
docker build -t samples/book-service-api .

docker run -p 8080:8080 samples/book-service-api
```

# Test
```bash
curl http://localhost:8080/actuator/health
```

# Security Aspects
Just as in classic VM deployments, processes should not be run with root permissions. Instead, the image should contain a non-root user that runs the application.

In a Dockerfile, you can achieve this by adding another layer that adds a (system) user and group and setting it as the current user (instead of the default, root):

```
FROM eclipse-temurin:17-jdk-alpine

RUN addgroup -S demo && adduser -S demo -G demo
USER demo
```

In case someone manages to break out of your application and run system commands inside the container, this precaution limits their capabilities (following the principle of least privilege).

> Some of the further Dockerfile commands only work as root, so maybe you have to move the USER command further down (for example, if you plan to install more packages in the container, which works only as root).

Another consideration is that the full JDK is probably not needed by most applications at runtime, so we can safely switch to the JRE base image, once we have a multi-stage build. So, in the multi-stage build shown earlier we can use for the final, runnable image:

```
FROM eclipse-temurin:17-jre-alpine
```

As mentioned earlier, this also saves some space in the image, which would be occupied by tools that are not needed at runtime.

