FROM eclipse-temurin:17.0.4.1_1-jre
EXPOSE 8761
ADD target/spring-boot-discovery-service.jar spring-boot-discovery-service.jar
ENTRYPOINT ["java", "-jar", "spring-boot-discovery-service.jar"]