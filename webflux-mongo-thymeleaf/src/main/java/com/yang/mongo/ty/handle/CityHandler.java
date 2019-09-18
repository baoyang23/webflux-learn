package com.yang.mongo.ty.handle;

import com.yang.mongo.ty.dao.CityReposity;
import com.yang.mongo.ty.pojo.City;
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

    private final CityReposity cityReposity;

    @Autowired
    public CityHandler(CityReposity CityReposity){ this.cityReposity = CityReposity; }

    public Mono<City> save(City city) {
        return cityReposity.save(city);
    }
    public Mono<City> findCityById(Long id) {
        return cityReposity.findById(id);
    }
    public Flux<City> findAllCity() {
        return cityReposity.findAll();
    }

    public Mono<City> modifyCity(City city){
        return cityReposity.save(city);
    }

    public Mono<Long> deleteCity(Long id){
        cityReposity.deleteById(id);
        return Mono.create(cityMogoSink -> cityMogoSink.success(id));
    }

    public Mono<City> getByCityName(String cityName) {
        return cityReposity.findByCityName(cityName);
    }
}
