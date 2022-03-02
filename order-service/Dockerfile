FROM openjdk:17-ea-slim
VOLUME /tmp
COPY target/order-service-1.0.jar OrderService.jar
ENTRYPOINT ["sh", "-c", "java -jar OrderService.jar"]