package com.example.demo.controller;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    //URL FOR COUNTRY INSERTION
    @PostMapping("/addCountry")
    public Country addCountry(@RequestBody Country country) {
        return service.saveCountry(country);
    }

    //URL FOR A LIST OF COUNTRY INSERTION
    @PostMapping("/addCountries")
    public List<Country> addCountries(@RequestBody List<Country> countries) {
        return service.saveCountries(countries);
    }

    //URL FOR RETRIEVING ALL COUNTRIES
    @GetMapping("/countries")
    public List<Country> findAllCountries() {
        return service.getCountries();
    }

    //URL FOR RETRIEVING A COUNTRY BY ITS ID
    @GetMapping("/countryById/{id}")
    public Country findCountryById(@PathVariable int id) {
        return service.getCountryById(id);
    }

    //URL FOR RETRIEVING A COUNTRY BY ITS NAME
    @GetMapping("/countryByName/{name}")
    public Country findCountrytByName(@PathVariable String name) {
        return service.getCountryByName(name);
    }

    //URL FOR UPDATING A COUNTRY
    @PutMapping("/update")
    public Country updateCountry(@RequestBody Country country) {
        return service.updateCountry(country);
    }

    //URL FOR DELETING A COUNTRY
    @DeleteMapping("/delete/{id}")
    public String deleteCountry(@PathVariable int id) {
        return service.deleteCountry(id);
    }
}
