package info.luckydog.server01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * UserController
 *
 * @author eric
 * @since 2019/11/8
 */
@RestController
@Slf4j
public class UserController implements UserService {

    @Value("#{applicationConfig.port}")
    private String port;

    public User getUser() {
        log.info("getUser...");
        return new User(1L, "test " + port);
    }

    public List<User> getUsers() {
        log.info("getUsers...");
        return Arrays.asList(new User(1L, "test1"), new User(2L, "test2"));
    }
}
