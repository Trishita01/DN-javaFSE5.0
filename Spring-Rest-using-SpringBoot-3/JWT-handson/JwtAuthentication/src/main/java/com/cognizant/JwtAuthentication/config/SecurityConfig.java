package com.cognizant.JwtAuthentication.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {


    @Bean
    public UserDetailsService userDetailsService() {


        UserDetails user =
                User.builder()
                        .username("admin")
                        .password("{noop}admin123")
                        .roles("USER")
                        .build();


        return new InMemoryUserDetailsManager(user);
    }



    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http) throws Exception {


        http
                .csrf(csrf -> csrf.disable())

                .authorizeHttpRequests(auth -> auth

                        .requestMatchers("/authenticate")
                        .permitAll()

                        .anyRequest()
                        .authenticated()
                );


        return http.build();
    }



    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration configuration)
            throws Exception {

        return configuration.getAuthenticationManager();
    }

}