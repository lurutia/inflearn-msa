FROM openjdk:17-ea-slim
VOLUME /tmp
COPY target/catalog-service-1.0.jar CatalogService.jar
ENTRYPOINT ["sh", "-c", "java -jar CatalogService.jar"]