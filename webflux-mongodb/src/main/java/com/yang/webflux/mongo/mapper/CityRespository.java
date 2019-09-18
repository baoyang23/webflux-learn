package com.yang.webflux.mongo.mapper;

import com.yang.webflux.mongo.pojo.City;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/18 23:21
 * @Version 1.0
 * @qq: 1411091515
 */
@Repository
public interface CityRespository extends ReactiveCrudRepository<City,Long> {


}
