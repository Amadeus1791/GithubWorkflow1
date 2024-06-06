//package com.example.githubworkflow1;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class IntegrationTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void testHomePage() {
//        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
//        assertThat(response.getStatusCode().value()).isEqualTo(200);
//        assertThat(response.getBody()).contains("Welcome to Spring Boot");
//    }
//}
//
