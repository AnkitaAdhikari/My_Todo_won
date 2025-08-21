package com.example.practice.ForMySelf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // disable CSRF for testing (important for POST/DELETE)
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // allow all endpoints without authentication
            );
        return http.build();
    }
}
