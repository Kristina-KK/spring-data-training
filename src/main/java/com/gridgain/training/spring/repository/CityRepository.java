package com.gridgain.training.spring.repository;

import com.gridgain.training.spring.model.City;
import com.gridgain.training.spring.model.CityKey;
import com.gridgain.training.spring.model.TopView;
import org.apache.ignite.springdata22.repository.IgniteRepository;
import org.apache.ignite.springdata22.repository.config.Query;
import org.apache.ignite.springdata22.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

import javax.cache.Cache;
import java.util.List;

@RepositoryConfig(cacheName = "City")
@Repository
public interface CityRepository extends IgniteRepository<City, CityKey> {

    public Cache.Entry<CityKey, City> findById(int id);

    @Query("SELECT new com.gridgain.training.spring.model.TopView(city.name, MAX(city.population), country.name) FROM country " +
            "JOIN city ON city.countrycode = country.code " +
            "GROUP BY city.name, country.name, city.population " +
            "ORDER BY city.population DESC LIMIT ?")
    public List<TopView> findTopXMostPopulatedCities(int limit);

}