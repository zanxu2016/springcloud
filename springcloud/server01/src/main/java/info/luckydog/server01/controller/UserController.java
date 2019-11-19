package info.luckydog.server01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author eric
 * @since 2019/11/8
 */
@RestController
@Slf4j
public class UserController {

    @Value("#{applicationConfig.port}")
    private String port;

    @GetMapping(value = "user")
    public String getUser() {
        log.info("getUser at {}.", port);
        return "get test user at " + port;
    }
}
