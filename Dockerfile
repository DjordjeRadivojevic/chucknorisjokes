FROM openjdk:8-jdk-alpine
EXPOSE 8081
VOLUME /tmp
COPY target/docker-chuch-noris-joke.jar docker-chuch-noris-joke
ENTRYPOINT ["java","-jar","/docker-chuch-noris-joke.jar"]