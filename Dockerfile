FROM eclipse-temurin:21-jdk-alpine

ADD ./target/kubernatives-devops-nagarro-assignment.jar kubernatives-devops-nagarro-assignment.jar

EXPOSE 6161

ENTRYPOINT ["java", "-jar", "kubernatives-devops-nagarro-assignment.jar"]
