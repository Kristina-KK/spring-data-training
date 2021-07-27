package com.gridgain.training.spring;

import com.gridgain.training.spring.model.Country;
import java.util.List;
import org.apache.ignite.springdata22.repository.IgniteRepository;
import org.apache.ignite.springdata22.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

@RepositoryConfig(cacheName = "Country")
@Repository
public interface CountryRepository extends IgniteRepository<Country, String> {

    public List<Country> findByPopulationGreaterThanOrderByPopulationDesc(int population);

}

