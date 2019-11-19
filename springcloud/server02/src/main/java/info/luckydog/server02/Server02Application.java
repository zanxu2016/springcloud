package info.luckydog.server02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Server01Application
 *
 * @author eric
 * @since 2019/11/8
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Server02Application {
    public static void main(String[] args) {
        SpringApplication.run(Server02Application.class);
    }
}
