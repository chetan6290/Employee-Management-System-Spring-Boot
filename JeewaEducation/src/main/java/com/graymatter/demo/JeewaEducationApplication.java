
package com.graymatter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JeewaEducationApplication {

    public static void main(String[] args) {

        // Temporarily generate a BCrypt password
        System.out.println(
            new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder()
                .encode("Admin@123")
        );

        // Start Spring Boot
        SpringApplication.run(
            JeewaEducationApplication.class, args
        );
    }
}