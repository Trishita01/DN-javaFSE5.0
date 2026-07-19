package com.cognizant.RESTCountryCodeService.controller;


import com.cognizant.RESTCountryCodeService.model.Country;
import com.cognizant.RESTCountryCodeService.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CountryController {


    @Autowired
    private CountryService countryService;



    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {


        return countryService.getCountry(code);

    }

}