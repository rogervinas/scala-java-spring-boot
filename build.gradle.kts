import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED

plugins {
  id("org.springframework.boot") version "3.4.1"
  id("io.spring.dependency-management") version "1.1.7"
  java
  scala
}

group = "com.foo"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.scala-lang:scala3-library_3:3.6.2")

  testImplementation("org.springframework.boot:spring-boot-starter-test")

  testImplementation("org.scalatest:scalatest_3:3.2.19")
  testRuntimeOnly("org.scalatestplus:junit-5-10_3:3.2.19.1")

  implementation(platform("org.junit:junit-bom:5.11.4"))
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testImplementation("org.junit.jupiter:junit-jupiter-params")
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

tasks.withType<Test>().configureEach {
  useJUnitPlatform {
    includeEngines("scalatest", "junit-jupiter")
  }
  testLogging {
    events(PASSED, SKIPPED, FAILED)
    exceptionFormat = FULL
    showExceptions = true
    showCauses = true
    showStackTraces = true
  }
}

tasks.withType<Jar> {
  // Avoid error as both java and scala will generate duplicated classes
  duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
