package com.yang.webflux.hello.router;

import com.yang.webflux.hello.handler.CityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


/**
 * @Author: Mu_Yi
 * @Date: 2019/9/17 23:35
 * @Version 1.0
 * @qq: 1411091515
 */

@Configuration
public class CityRouter {

    @Bean
    public RouterFunction<ServerResponse> routerCity(CityHandler cityHandler){
        return RouterFunctions.route(RequestPredicates.GET("/hello").
                and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),cityHandler::helloCity);
    }

}
