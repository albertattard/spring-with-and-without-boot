# Spring Framework with and without Spring Boot

This repository has two projects

1. [Spring Framework without Spring Boot](spring-without-boot)
1. [Spring Framework with Spring Boot](spring-with-boot)

Both projects share the same controller and perform the same thing, return the list of countries in which ThoughtWorks has an office.

## Build and run

1. Build both projects

   ```bash
   $ ./gradlew clean build
   ```

1. Create docker image and run the Spring Framework without Spring Boot version

   ```bash
   $ docker build ./spring-without-boot -t spring-without-boot:local
   $ docker run -d -p 8081:8080 -it --name without-boot spring-without-boot:local
   ```

1. Create docker image (using the `bootBuildImage` Gradle task) and run the Spring Framework with Spring Boot version

   ```bash
   $ ./gradlew bootBuildImage --imageName=spring-with-boot:local
   $ docker run -d -p 8082:8080 -it --name with-boot spring-with-boot:local
   ```

   The Spring Boot version can also be executed without docker

   ```bash
   $ java -jar spring-with-boot/build/libs/spring-with-boot-1.0.jar
   ```

1. Access the REST endpoint

   1. Access Spring application without Spring Boot

      ```bash
      $ curl "http://localhost:8081/countries"
      ```

   1. Access Spring Boot application

      ```bash
      $ curl "http://localhost:8082/countries"
      ```

   Both endpoints will return the same thing.

   ```json
   [{"name":"Australia"},{"name":"Brazil"},{"name":"Canada"},{"name":"Chile"},{"name":"China"},{"name":"Ecuador"},{"name":"Germany"},{"name":"India"},{"name":"Italy"},{"name":"Singapore"},{"name":"Spain"},{"name":"Thailand"},{"name":"United Kingdom"},{"name":"United States of America"}]
   ```

1. Stop the docker containers

   ```bash
   $ docker stop with-boot
   $ docker stop without-boot
   ```
