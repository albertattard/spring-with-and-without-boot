FROM adoptopenjdk/openjdk14:jre-14.0.1_7-alpine
WORKDIR /opt/app
ADD build/libs/spring-with-boot-1.0.jar ./application.jar
EXPOSE 8080
CMD ["java", "-jar", "application.jar"]
