package info.luckydog.server02.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Server02Controller
 *
 * @author eric
 * @since 2019/11/8
 */
@Slf4j
@RestController
public class Server02Controller {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String hello() {
        List<String> services = discoveryClient.getServices();
        for (String s : services) {
            log.info("find service: {}", s);
        }
        return "hello spring cloud!";
    }

    @RequestMapping(value = "/nice")
    public String nice() {
        List<String> services = discoveryClient.getServices();
        for (String s : services) {
            log.info("go go go : " + s);
        }
        return "nice to meet you!";
    }

}
