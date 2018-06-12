FROM openjdk:alpine

WORKDIR /apps

ADD build/libs/greeter-api-0.1.0.jar /apps

EXPOSE 8181

CMD ["java", "-jar", "greeter-api-0.1.0.jar"]
