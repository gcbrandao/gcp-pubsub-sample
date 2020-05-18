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

A few motivating and useful examples of how your product can be used. Spice this up with code blocks and potentially more screenshots.

_For more examples and usage, please refer to the [Wiki][wiki]._

## Development setup

Describe how to install all development dependencies and how to run an automated test-suite of some kind. Potentially do this for multiple platforms.

```sh
make install
npm test
```

## Release History

* 0.2.1
    * CHANGE: Update docs (module code remains unchanged)
* 0.2.0
    * CHANGE: Remove `setDefaultXYZ()`
    * ADD: Add `init()`
* 0.1.1
    * FIX: Crash when calling `baz()` (Thanks @GenerousContributorName!)
* 0.1.0
    * The first proper release
    * CHANGE: Rename `foo()` to `bar()`
* 0.0.1
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
