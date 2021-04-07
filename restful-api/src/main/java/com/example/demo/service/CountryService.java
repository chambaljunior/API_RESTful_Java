package com.example.demo.service;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    //SAVE A COUNTRY
    public Country saveCountry(Country country) {
        return repository.save(country);
    }

    //SAVE A LIST OF COUNTRIES
    public List<Country> saveCountries(List<Country> countries) {
        return repository.saveAll(countries);
    }

    //RETRIEVE ALL COUNTRIES FROM DATABASE
    public List<Country> getCountries() {
        return repository.findAll();
    }

    //RETRIEVE COUNTRY BY ITS ID
    public Country getCountryById(int id) {
        return repository.findById(id).orElse(null);
    }

    //FIND COUNTRY BY ITS NAME
    public Country getCountryByName(String name) {
        return repository.findByName(name);
    }

    //DELETING COUNTRY WITH ID AND SHOWING MESSAGE FOR CONFIRMATION
    public String deleteCountry(int id) {
        repository.deleteById(id);
        return "Country with id "+ id +", was successfully removed";
    }

    //CODE FOR UPDATE COUNTRY WITH ID
    public Country updateCountry(Country country) {
        Country knownCountry = repository.findById(country.getId()).orElse(null);
        knownCountry.setName(country.getName());
        knownCountry.setCapital(country.getCapital());
        knownCountry.setRegion(country.getRegion());
        knownCountry.setSubRegion(country.getSubRegion());
        knownCountry.setArea(country.getArea());
        return repository.save(knownCountry);
    }

}
