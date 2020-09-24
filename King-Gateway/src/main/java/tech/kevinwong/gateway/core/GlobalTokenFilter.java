package tech.kevinwong.gateway.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Program: King-Cloud
 * @Class: GlobalTokenFilter
 * @Description:
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-24 14:36
 **/
@Slf4j
@Component
public class GlobalTokenFilter implements GlobalFilter, Ordered {
    /**
     * 过滤执行体
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        /*获取token*/
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if (token == null || token.isEmpty()) {
            log.error("您尚未登陆，请登陆后重试");
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().writeWith(Flux.just(exchange.getResponse().bufferFactory().wrap("您尚未登陆，请登陆后重试".getBytes())));
        }
        return chain.filter(exchange);
    }

    /**
     * 设置当前过滤器的优先级，值越大，优先级越低
     */
    @Override
    public int getOrder() {
        return -100;
    }
}
