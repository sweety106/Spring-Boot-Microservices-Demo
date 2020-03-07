FROM ubuntu
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN java -version
COPY target/MicroserviceDiscoveryServer-1.0.0.jar .
ENTRYPOINT ["java", "-jar", "MicroserviceDiscoveryServer-1.0.0.jar"]
