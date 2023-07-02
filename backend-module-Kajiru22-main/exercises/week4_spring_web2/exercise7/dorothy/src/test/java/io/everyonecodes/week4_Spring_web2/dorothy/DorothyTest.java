package io.everyonecodes.week4_Spring_web2.dorothy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class DorothyTest {

    @Autowired
    Dorothy dorothy;

    @MockBean
    RestTemplate restTemplate;

    @Value("${urlWizard}")
    String urlWizard;


    @Test
    void dorothy() {
        String url = "home";
        String expected = "My home is Kansas";
        Mockito.when(restTemplate.getForObject(urlWizard, String.class)).thenReturn(url);
        Mockito.when(restTemplate.getForObject(url, String.class)).thenReturn("Kansas");
        String result = dorothy.interact();
        Assertions.assertEquals(expected, result);
        Mockito.verify(restTemplate).getForObject(urlWizard, String.class);
        Mockito.verify(restTemplate).getForObject(url, String.class);
    }
}