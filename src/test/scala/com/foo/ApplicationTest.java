package com.foo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ApplicationTest {

	@LocalServerPort
	private int port;

	private final RestTemplate rest = new RestTemplate();

	private String url;

	@Before
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
