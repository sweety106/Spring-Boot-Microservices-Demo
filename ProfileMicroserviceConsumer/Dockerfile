FROM ubuntu
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN java -version
RUN apt-get install -y git
RUN apt-get install -y maven
RUN git clone https://github.com/STRYDER-007/Spring-Boot-Microservices-Demo.git
WORKDIR /Spring-Boot-Microservices-Demo/ProfileMicroserviceConsumer
RUN ls
# Replace localhost with Eureka's public ip exposed by Kubernetes
RUN sed -i 's+http://localhost:1111/eureka/+http://104.155.169.205:1111/eureka/+g' src/main/resources/application.yml
RUN mvn clean install
#RUN mkdir mydir
#COPY src mydir/src
#COPY target/ProfileMicroserviceConsumer-1.0.0.jar  mydir/target/ProfileMicroserviceConsumer-1.0.0.jar
#RUN pwd
#RUN chmod 777 mydir/target/ProfileMicroserviceConsumer-1.0.0.jar
#RUN cd mydir
# COPY target/ProfileMicroserviceConsumer-1.0.0.jar   .
ENTRYPOINT ["java", "-jar", "target/ProfileMicroserviceConsumer-1.0.0.jar"]
