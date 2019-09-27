FROM openjdk:8-jdk-alpine

COPY target/store-order-0.0.1-SNAPSHOT.jar /store-order/

EXPOSE 8096

WORKDIR /store-order

ENTRYPOINT java -jar store-order-0.0.1-SNAPSHOT.jar
