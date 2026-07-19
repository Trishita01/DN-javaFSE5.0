package com.cognizant.JwtAuthentication.service;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;


@Service
public class AuthenticationService {


    private final AuthenticationManager authenticationManager;

    private final JwtService jwtService;



    public AuthenticationService(
            AuthenticationManager authenticationManager,
            JwtService jwtService) {

        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;

    }



    public String authenticate(
            String username,
            String password) {


        // Step 1: Verify username and password

        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(
                        username,
                        password
                )

        );


        // Step 2: Generate JWT if authentication succeeds

        return jwtService.generateToken(username);

    }

}