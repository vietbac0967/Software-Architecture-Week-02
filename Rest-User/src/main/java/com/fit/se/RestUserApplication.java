package com.fit.se;

import com.fit.se.model.User;
import com.fit.se.repository.UserRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestUserApplication.class, args);
    }

//    @Autowired
//    private UserRepository userRepository;

//    @Bean
//    CommandLineRunner commandLineRunner() {
//        Faker faker = new Faker();
//        return args -> {
//            for (int i = 0; i < 5; i++) {
//                User user = User.builder()
//                        .firstName(faker.name().firstName())
//                        .lastName(faker.name().lastName())
//                        .build();
//                userRepository.save(user);
//            }
//        };
//    }
}
