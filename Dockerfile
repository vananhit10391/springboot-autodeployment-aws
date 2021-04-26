 #!/usr/bin/env bash
FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} springboot-autodeployment-aws.jar
EXPOSE 8005
ENTRYPOINT ["java","-jar","springboot-autodeployment-aws.jar"]