package info.luckydog.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * UserRibbonController
 *
 * @author eric
 * @since 2019/11/8
 */
@RestController
public class UserRibbonController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("#{applicationConfig.server01}")
    private String server01Url;

    @RequestMapping("user")
    public ResponseEntity<String> getUser() {
        return restTemplate.getForEntity(server01Url + "/user", String.class, new Object());
    }
}
