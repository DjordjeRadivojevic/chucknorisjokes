FROM openjdk:8
EXPOSE 8080
ADD target/docker-chuch-noris-joke.jar docker-chuch-noris-joke
ENTRYPOINT ["java","-jar","/docker-chuch-noris-joke.jar"]