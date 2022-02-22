package com.gridgain.training.spring.web;

import com.gridgain.training.spring.model.TopView;
import com.gridgain.training.spring.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldDatabaseController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping("/api/mostPopulated")
    public List<TopView> getMostPopulatedCities(@RequestParam(value = "limit", required = false) Integer limit) {
        return cityRepository.findTopXMostPopulatedCities(limit);
    }

}
