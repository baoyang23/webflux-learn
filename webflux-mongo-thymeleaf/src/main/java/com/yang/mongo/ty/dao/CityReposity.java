package com.yang.mongo.ty.dao;

import com.yang.mongo.ty.pojo.City;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/18 23:49
 * @Version 1.0
 * @qq: 1411091515
 */

@Repository
public interface CityReposity extends ReactiveCrudRepository<City,Long> {

    Mono<City> findByCityName(String cityName);

}
