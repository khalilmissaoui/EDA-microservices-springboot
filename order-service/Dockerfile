FROM eclipse-temurin:17.0.4.1_1-jre
EXPOSE 8080
ADD target/spring-boot-order-service.jar spring-boot-order-service.jar
ENTRYPOINT ["java", "-jar", "spring-boot-order-service.jar"]