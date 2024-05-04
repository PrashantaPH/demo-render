FROM eclipse-temurin:17-jre-alpine

VOLUME /tmp

COPY target/*.jar demo-render.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/demo-render.jar"]