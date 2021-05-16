package com.github.rilber.citiesapi.counties.repository;

import com.github.rilber.citiesapi.counties.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
