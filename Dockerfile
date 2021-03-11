FROM openjdk:8-jdk-alpine
EXPOSE 8081
VOLUME /tmp
ADD target/docker-chuch-noris-joke.jar docker-chuch-noris-joke.jar
ENTRYPOINT ["java","-jar","/docker-chuch-noris-joke.jar"]