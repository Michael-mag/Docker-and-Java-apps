FROM openjdk:16-alpine3.13

COPY target/using_docker_tutorials-1.0-SNAPSHOT.jar /deployments/
CMD java -jar /deployments/using_docker_tutorials-1.0-SNAPSHOT.jar