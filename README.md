# GCP Pubsub Sample Lab
> How to use GCP Pubsub message queue with Spring Boot and Spring Cloud 


This project cover how to use a GCP PubSub service with Java + Spring Boot and Spring Cloud. We have simple exemples 
publising/consuming an single String but also we have more complex examples covering how to publish and consume objects 
with serialization and deserialization of objects including java.util.DateLocal propreties!!     

![](header.png)

## Installation

OS X & Linux & Windows:
You can run the application from the command line with Maven. You can also build a single executable JAR file that 
contains all the necessary dependencies, classes, and resources and run that. Building an executable jar so makes it easy to ship, 
version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

With Maven, you can run the application by using
```sh
./mvnw spring-boot:run
```
Alternatively, you can build the JAR file with
```sh
./mvnw clean package
```
and then run the JAR file, as follows:
```sh
 java -jar target/gcp-pubsub-sample-0.0.1-SNAPSHOT.jar
```

## Usage example

**Testing the application**

Now that the application is running, you can test it. I suggest you to use Postmant to send requests to it´s applications.

**Simple message Postman:**
```sh
GET http://localhost:8080/filas/publish/TESTE NOVA MANSAGEM
```
**Simple message curl:**
```sh
curl --location --request GET 'http://localhost:8080/filas/publish/TESTE NOVA MANSAGEM'
```

**Complex Message ( with object serializer) Postman:**
```sh
POST http://localhost:8080/filas/
PAYLOAD:
{
    "nome": "Mestre Yoda",
    "login": "yoda-root",
    "dataNascimento": "1978-03-13"
}
```

**Complex Message ( with object serializer) Curl:**
```sh
curl --location --request POST 'http://localhost:8080/filas/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "nome": "Mestre Yoda",
    "login": "yoda-root",
    "dataNascimento": "1978-03-13"
}'
```

## Development setup

This project don´t cover how to setup GCP environment.

First clone this project to your environment
```sh
 git clone https://github.com/gcbrandao/gcp-pubsub-sample.git
```
Then import to your favourite IDE and start work



## Release History

* 0.0.1-SNAPSHOT
    * Work in progress

## Meta

Gilberto C Brandao – [@gcbandao](https://twitter.com/gcbandao) – gcbrandao@gmail.com

Distributed under the XYZ license. See ``LICENSE`` for more information.

[https://github.com/gcbrandao/](https://github.com/gcbrandao/)

## Contributing

1. Fork it (<https://github.com/gcbrandao/gcp-pubsub-sample/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
