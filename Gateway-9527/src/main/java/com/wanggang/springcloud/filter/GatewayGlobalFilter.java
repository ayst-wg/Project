package com.wanggang.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName : GatewayGlobalFilter
 * @Description : GatewayGlobalFilter
 * @Author : wanggang
 * @Date: 2020-09-29 22:53
 * @Version 1.0
 **/
@Component
@Slf4j
public class GatewayGlobalFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null){
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            log.info("globalFilter：username is null！！！");
            return exchange.getResponse().setComplete();
        }
        log.info("globalFilter：username = " + username);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
