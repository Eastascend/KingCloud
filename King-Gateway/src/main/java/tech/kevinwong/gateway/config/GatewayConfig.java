package tech.kevinwong.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.kevinwong.gateway.core.RequestTimeFilter;

/**
 * @Program: King-Cloud
 * @Class: GatewayConfig
 * @Description: 网关配置
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-24 14:56
 **/
@Configuration
public class GatewayConfig {
    /**
     * 添加路由并给路由添加过滤器
     *
     * @param
     * @return
     */
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/config/**")
                        .filters(f -> f.filter(new RequestTimeFilter())
                                .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                        .uri("lb://KingCloud-Config")
                        .order(0)
                        .id("KingCloud-Config")
                )
                .build();
    }
}
