package io.powerledger.stevefidgeon.quicksortApi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class QuicksortApiApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void shouldReturn45() throws Exception {
		//http://localhost:8080/processList?unsortedList=2,4,6,8,1,3,5,7,9
		
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/processList?unsortedList=2,4,6,8,1,3,5,7,9", String.class).contains("45"));
		
	}
}
