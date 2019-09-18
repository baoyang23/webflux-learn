package com.yang.webflux.thymeleaf.controller;

import com.yang.webflux.thymeleaf.pojo.City;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/18 23:33
 * @Version 1.0
 * @qq: 1411091515
 */

@RestController
public class ThymeleafController {

    @GetMapping("/hello")
    public Mono<String> hello(final Model model) {
        model.addAttribute("name", "泥⽡瓦匠");
        model.addAttribute("city", "浙江温岭");
        String path = "hello";
        return Mono.create(monoSink -> monoSink.success(path));
    }


    private static final String CITY_LIST_PATH_NAME = "cityList";
    @GetMapping("/page/list")
    public String listPage(final Model model) {
        List<Map<String,String>> resultList = new ArrayList<>();
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("id","1");
        dataMap.put("provinceId","SZ");
        dataMap.put("cityName","SZSZ");
        dataMap.put("description","This is SZ");
        resultList.add(dataMap);
        model.addAttribute("cityList", resultList);
        // final Flux<City> cityFluxList = cityHandler.findAllCity();
        // model.addAttribute("cityList", cityFluxList);
        return CITY_LIST_PATH_NAME;
    }

}
