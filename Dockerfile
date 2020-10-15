FROM openjdk:8-jre
VOLUME /tmp
WORKDIR /data
COPY target/category-service.jar  /data
ENTRYPOINT ["java" ,"-jar", "category-service.jar"]