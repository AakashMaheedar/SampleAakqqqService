FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/sampleaakqqq.jar sampleaakqqq.jar
ENTRYPOINT ["java","-jar","sampleaakqqq.jar"]