package info.luckydog.server01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Server01Application
 *
 * @author eric
 * @since 2019/11/7
 */
@EnableEurekaClient
@EnableDiscoveryClient // 可被发现的服务，向外提供服务
@SpringBootApplication
public class Server01Application {
    public static void main(String[] args) {
        SpringApplication.run(Server01Application.class);
    }
}
