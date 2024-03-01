[![CI](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/gradle.yml/badge.svg?branch=master)](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/gradle.yml)
![Java](https://img.shields.io/badge/Java-21-blue?labelColor=black)
![Scala](https://img.shields.io/badge/Scala3-3.4.0-blue?labelColor=black)
![SpringBoot](https://img.shields.io/badge/SpringBoot-3.2.3-blue?labelColor=black)

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
curl -i "localhost:8000/hello?name=You"
```
