package com.cognizant.RESTCountryCodeService.service;


import com.cognizant.RESTCountryCodeService.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class CountryService {


    @Autowired
    private ApplicationContext context;



    public Country getCountry(String code) {


        List<Country> countries = Arrays.asList(

                (Country) context.getBean("countryIndia"),
                (Country) context.getBean("countryUSA"),
                (Country) context.getBean("countryJapan")

        );


        for(Country country : countries) {

            if(country.getCode().equalsIgnoreCase(code)) {

                return country;

            }

        }


        return null;

    }

}