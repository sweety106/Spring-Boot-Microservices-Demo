FROM ubuntu
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN java -version
COPY target/ProfileMicroserviceProducer-1.0.0.jar .
ENTRYPOINT ["java", "-jar", "ProfileMicroserviceProducer-1.0.0.jar"]
