package com.cognizant.JwtAuthentication.controller;


import com.cognizant.JwtAuthentication.model.AuthRequest;
import com.cognizant.JwtAuthentication.service.AuthenticationService;

import org.springframework.web.bind.annotation.*;


@RestController
public class AuthController {


    private final AuthenticationService authenticationService;


    public AuthController(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;

    }



    @PostMapping("/authenticate")
    public String authenticate(
            @RequestBody AuthRequest request) {


        return authenticationService.authenticate(
                request.getUsername(),
                request.getPassword()
        );

    }

}