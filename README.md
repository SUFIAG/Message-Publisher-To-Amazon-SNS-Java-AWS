# Spring Boot project to publish messages to Amazon SNS

This is a simple Spring Boot project to publish messages to an Amazon SNS topic.

## How to run

After you clone this repo, build the project using the command below:

```shell script
mvn clean install
``` 

This will build the project and create a ```.jar``` file in the ```target/``` directory. Then run the following command 
to run the project:

```shell script
java -jar target/AmazonSNSPublisherPOC-1.0-SNAPSHOT.jar
```