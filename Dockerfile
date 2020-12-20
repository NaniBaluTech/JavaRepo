FROM maven:3.6.3-openjdk-16

WORKDIR /opt

RUN mkdir /opt/src
COPY pom.xml /opt
COPY src /opt/src

RUN mvn package 

CMD java -jar ./target/springBootDocker-0.0.1-SNAPSHOT.jar

