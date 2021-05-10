package com.dio.citiesapi.state;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StateResource {

    private final StateRepository repository;

    @GetMapping
    public List<State> findAll() {
        return repository.findAll();
    }
}
