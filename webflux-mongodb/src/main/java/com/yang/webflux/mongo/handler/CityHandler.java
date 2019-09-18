package com.yang.webflux.mongo.handler;

import com.mongodb.Mongo;
import com.yang.webflux.mongo.mapper.CityRespository;
import com.yang.webflux.mongo.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/18 23:23
 * @Version 1.0
 * @qq: 1411091515
 */

@Component
public class CityHandler {

    private final CityRespository cityRespository;

    @Autowired
    public CityHandler(CityRespository cityRespository){ this.cityRespository = cityRespository; }

    public Mono<City> save(City city) {
        return cityRespository.save(city);
    }
    public Mono<City> findCityById(Long id) {
        return cityRespository.findById(id);
    }
    public Flux<City> findAllCity() {
        return cityRespository.findAll();
    }

    public Mono<City> modifyCity(City city){
        return cityRespository.save(city);
    }

    public Mono<Long> deleteCity(Long id){
        cityRespository.deleteById(id);
        return Mono.create(cityMogoSink -> cityMogoSink.success(id));
    }

}
