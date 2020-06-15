# Spring with and without boot

This repository has two projects

1. [Spring without boot](spring-without-boot)
1. [Spring with Boot](spring-with-boot)

Both projects share the same controller and perform the same thing, return the list of countries in which ThoughtWorks has an office.

## Build and run

1. Build both projects

   ```bash
   $ ./gradlew clean build
   ```

1. Create docker image and run the Spring without Boot version

   ```bash
   $ docker build ./spring-without-boot -t spring-without-boot:local
   $ docker run -p 8081:8080 -it spring-without-boot:local
   ```

1. Create docker image and run the Spring with Boot version

   ```bash
   $ docker build ./spring-with-boot -t spring-with-boot:local
   $ docker run -p 8082:8080 -it spring-with-boot:local
   ```

   The Spring Boot version can also be executed without docker

   ```bash
   $ java -jar spring-with-boot/build/libs/spring-with-boot-1.0.jar
   ```
