package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "COUNTRY_TBL") //WILL AUTO CREATE THE TABLE ON DATABASE AND GIVE IT A NAME
public class Country {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String capital;
    private String region;
    private String subRegion;
    private String area;

    public Country() {

    }

    public Country(int id, String name, String capital, String region, String subRegion, String area) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subRegion = subRegion;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
