package com.dio.citiesapi.cities;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CityResource {

    private final CityRepository repository;

    @GetMapping
    public Page<City> findAll(final Pageable page) {
        return repository.findAll(page);
    }

}
