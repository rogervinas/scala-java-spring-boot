# Scala in a Java Spring Project

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
