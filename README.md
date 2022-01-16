[![CI](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/gradle.yml/badge.svg?branch=master)](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/gradle.yml)
[![CodeQL](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/codeql-analysis.yml/badge.svg?branch=master)](https://github.com/rogervinas/scala-java-spring-boot/actions/workflows/codeql-analysis.yml)

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
