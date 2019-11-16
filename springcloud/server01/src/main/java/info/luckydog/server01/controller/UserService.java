package info.luckydog.server01.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * UserFeignService
 *
 * @author eric
 * @since 2019/11/8
 */
@FeignClient("server01")// 此注解，表示向外提供服务，server01为该应用名称，application.yml 中的 spring.application.name 对应值
public interface UserService {

    @RequestMapping(value = "user", method = RequestMethod.GET)
    User getUser();

    @RequestMapping(value = "users", method = RequestMethod.GET)
    List<User> getUsers();

}
