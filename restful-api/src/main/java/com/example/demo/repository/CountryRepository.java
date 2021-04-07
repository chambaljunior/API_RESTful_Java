package com.example.demo.repository;

import com.example.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country,Integer> {

    //METHOD MANUALLY IMPLEMENTED TO GET A COUNTRY BY ITS NAME
    Country findByName(String name);
}
