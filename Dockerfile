FROM openjdk:8
EXPOSE 8080
ADD target/Demo.jar Demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
