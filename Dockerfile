# Java 17 é o mínimo do Spring Boot 3+; a imagem com JDK 11 não compila o projeto
FROM maven:3.9-eclipse-temurin-17 AS MAVEN_BUILD
# copy the pom and src code to the container
COPY ./ ./
# package our application code
RUN mvn clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r target/
EXPOSE 8080
# set the startup command to execute the jar
CMD ["java", "-jar", "target/teste-docker-0.0.1-SNAPSHOT.jar"]