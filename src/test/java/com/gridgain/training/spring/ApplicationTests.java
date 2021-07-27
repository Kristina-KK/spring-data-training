package com.gridgain.training.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private CountryRepository countryRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void countryRepositoryWorks() {
		System.out.println("count=" + countryRepository.findByPopulationGreaterThanOrderByPopulationDesc(100_000_000).size());
	}

}
