FROM frolvlad/alpine-oraclejdk8:slim
ADD target/springboot-helloworld-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9999
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
