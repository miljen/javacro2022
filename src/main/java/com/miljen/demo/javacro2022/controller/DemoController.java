package com.miljen.demo.javacro2022.controller;

import com.miljen.demo.javacro2022.model.Predavanje;
import com.miljen.demo.javacro2022.repository.PredavanjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private PredavanjeRepository repository;

    @GetMapping
    public List<Predavanje> getPredavanja() {

        return (List<Predavanje>) repository.findAll();
    }
}
