FROM java:8-jdk-alpine

COPY ./target/*.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch dtermination-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","dtermination-0.0.1-SNAPSHOT.jar"]
