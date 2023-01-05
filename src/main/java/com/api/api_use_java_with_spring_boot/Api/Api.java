package com.api.api_use_java_with_spring_boot.Api;

import org.springframework.web.bind.annotation.*;

import com.api.api_use_java_with_spring_boot.Inteface.PersoneRepositoryInterface;
import com.api.api_use_java_with_spring_boot.Table.Persone;

@RestController
public class Api {
    private final PersoneRepositoryInterface personeRepositoryInterface;

    Api(PersoneRepositoryInterface repository) {
        personeRepositoryInterface = repository;
    }

    @CrossOrigin
    @GetMapping("/api")
    public Iterable<Persone> getPersone() {
        return personeRepositoryInterface.findAll();
    }
}
