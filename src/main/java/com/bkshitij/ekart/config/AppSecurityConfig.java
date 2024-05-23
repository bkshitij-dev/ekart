package com.bkshitij.ekart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/*
 * @author Kshitij
 * @created 23-May-2024
 */
@Configuration
public class AppSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/api/v1/home").permitAll()
                        .anyRequest().authenticated())
                        .formLogin(Customizer.withDefaults())
                        .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
