FROM tomcat:jdk14-openjdk-oracle
ADD build/libs/spring-without-boot-1.0.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
