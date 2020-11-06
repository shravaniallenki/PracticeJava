FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD target/*.jar dockerkubernetes.jar

ENTRYPOINT ["sh", "-c", "java -jar /dockerkubernetes.jar"]