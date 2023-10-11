# This is spring boot app Dockerfile
FROM adoptopenjdk:11-jre-hotspot
VOLUME /temp
ADD /target/*.jar app.jar
CMD ["java","-jar","app.jar","--spring.profiles.actives=prod"]
EXPOSE 8084