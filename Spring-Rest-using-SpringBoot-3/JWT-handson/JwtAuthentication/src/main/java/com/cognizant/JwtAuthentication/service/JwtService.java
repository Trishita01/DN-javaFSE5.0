package com.cognizant.JwtAuthentication.service;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class JwtService {


    private final String secretKey =
            "mysecretkeymysecretkeymysecretkeymysecretkey123456";


    public String generateToken(String username) {


        return Jwts.builder()

                .setSubject(username)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 1000 * 60 * 30
                        )
                )

                .signWith(
                        SignatureAlgorithm.HS256,
                        secretKey
                )

                .compact();

    }

}