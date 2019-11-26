package info.luckydog.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * GatewayApplication
 *
 * @author eric
 * @since 2019/11/25
 */
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }

    // 代码实现路由转发，功能与通过 application.yml 配置参数一样
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        // 请求 http://localhost:8080/about 会被转发到 http://ityouknow.com/about
        return builder.routes()
                .route("path_route", r -> r.path("/about").uri("http://ityouknow.com"))
                .build();
    }
}
