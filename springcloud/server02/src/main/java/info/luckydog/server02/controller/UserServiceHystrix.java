package info.luckydog.server02.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * UserServiceHystrix
 *
 * @author eric
 * @since 2019/11/16
 */
@Component
@Slf4j
public class UserServiceHystrix implements UserService {
    public String getUser() {
        log.info("fallback getUser...");
        return "UserService fallback: default user";
    }
}
