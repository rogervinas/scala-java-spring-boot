[![CI](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/gradle.yml/badge.svg?branch=master)](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/gradle.yml)
[![CodeQL](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/codeql-analysis.yml/badge.svg?branch=master)](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/codeql-analysis.yml)
![Java](https://img.shields.io/badge/Java-11-blue?labelColor=black)
![Scala](https://img.shields.io/badge/Scala-3.1.0-blue?labelColor=black)
![SpringBoot](https://img.shields.io/badge/SpringBoot-2.6.2-blue?labelColor=black)

# Scala in a Java Spring Boot Project

Based on https://github.com/srpraneeth/SpringsScala

![Diagram](doc/diagram.png)

## Build & Test

```
./gradlew clean build
```

## Run locally

Run it with:

```
./gradlew bootRun
```

and test it with:

```
curl -w '\n' localhost:8000/hello?name=You
```
