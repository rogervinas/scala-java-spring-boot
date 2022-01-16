package com.foo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ApplicationTest {

  @LocalServerPort
  private int port;

  private final RestTemplate rest = new RestTemplate();

  private String url;

  @BeforeEach
  public void setUp() {
    url = String.format("http://localhost:%d/", port);
  }

  @Test
  public void should_say_hello_to_the_world() {
    ResponseEntity<String> response = rest.getForEntity(url + "hello", String.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody()).isEqualTo("Hello World!");
  }

  @Test
  public void should_say_hello_to_john() {
    ResponseEntity<String> response = rest.getForEntity(url + "hello?name=John", String.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody()).isEqualTo("Hello John!");
  }
}
