package info.luckydog.server02.controller;

import info.luckydog.server01.controller.User;
import info.luckydog.server01.controller.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ConsumerController
 *
 * @author eric
 * @since 2019/11/8
 */
@RestController
@RequestMapping("consumer")
@Slf4j
public class ConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public User getUser() {
        log.info("getUser from UserService...");
        return userService.getUser();
    }

    @GetMapping("users")
    public List<User> getUsers() {
        log.info("getUsers from UserService...");
        return userService.getUsers();
    }
}
