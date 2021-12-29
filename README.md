[![Build Status](https://travis-ci.com/rogervinas/scala-java-spring.svg?branch=master)](https://travis-ci.com/rogervinas/scala-java-spring)

# Scala in a Java Spring Boot Project

Based on https://github.com/srpraneeth/SpringsScala

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
