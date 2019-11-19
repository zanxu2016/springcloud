package info.luckydog.server02.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserFeignService
 *
 * @author eric
 * @since 2019/11/8
 */
//@FeignClient("server01")// 此注解，访问指定服务，server01为该服务应用名称，application.yml 中的 spring.application.name 对应值
@FeignClient(value = "server01", fallback = UserServiceHystrix.class)// fallback 指定服务降级策略，需要在配置文件中添加 feign.hystrix.enabled=true
public interface UserService {

    @GetMapping(value = "user")
    String getUser();

}
