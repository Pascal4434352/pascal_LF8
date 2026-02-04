package de.wmfinals.controller;

import de.wmfinals.entity.Country;
import de.wmfinals.service.WMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/world-finals")
@RestController
public class WMcontroll {
    @Autowired
    private WMService service;

    @GetMapping
    public List<Country> getAllCountries(){
        return service.getAllCountries();
    }

    /*@GetMapping
    public String hello() {
        return "Hello World";
    }*/

}
