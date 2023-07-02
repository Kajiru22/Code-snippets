package io.everyonecodes.week4_Spring_web2.dorothy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class Dorothy {

    private final RestTemplate restTemplate;

    private final String urlWizard;

    public Dorothy(RestTemplate restTemplate,
                   @Value("${urlWizard}") String urlWizard) {
        this.restTemplate = restTemplate;
        this.urlWizard = urlWizard;
    }

    public String interact() {
        var homeUrl = restTemplate.getForObject(urlWizard, String.class);
        return "My home is " + restTemplate.getForObject(homeUrl, String.class);
    }
}
