package com.yang.webflux.crud.dao;

import com.yang.webflux.crud.pojo.City;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/17 23:49
 * @Version 1.0
 * @qq: 1411091515
 */

@Repository
public class CityRepository {

    private ConcurrentHashMap<Long, City> repository = new ConcurrentHashMap();

    private static final AtomicLong idGenerator = new AtomicLong(0);


    public Long save(City city) {
        Long id = idGenerator.incrementAndGet();
        city.setId(id);
        repository.put(id, city);
        return id;
    }
    public Collection<City> findAll() {
        return repository.values();
    }
    public City findCityById(Long id) {
        return repository.get(id);
    }
    public Long updateCity(City city) {
        repository.put(city.getId(), city);
        return city.getId();
    }
    public Long deleteCity(Long id) {
        repository.remove(id);
        return id;
    }

}
