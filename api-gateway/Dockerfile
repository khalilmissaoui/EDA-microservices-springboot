FROM eclipse-temurin:17.0.4.1_1-jre
EXPOSE 8080
ADD target/spring-boot-api-gateway-service.jar spring-boot-api-gateway-service.jar
ENTRYPOINT ["java", "-jar", "spring-boot-api-gateway-service.jar"]