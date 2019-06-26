package com.sda.mongodb;

import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/cats")
public class CatResource {
    private CatRepository catRepository;

    @GetMapping("/all")
    public List<Cat> getAllCats(){
        return this.catRepository.findAll();
    }
}
