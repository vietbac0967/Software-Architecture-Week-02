package com.fit.se;

import com.fit.se.model.Product;
import com.fit.se.repository.ProductRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestProductApplication.class, args);
    }

//    @Autowired
//    private ProductRepository productRepository;
//
//    @Bean
//    CommandLineRunner commandLineRunner() {
//        Faker faker = new Faker();
//        return args -> {
//            for (int i = 0; i < 5; i++) {
//                Product product = Product.builder()
//                        .name(faker.commerce().productName())
//                        .price(Double.parseDouble(faker.commerce().price()))
//                        .build();
//                productRepository.save(product);
//            }
//        };
//    }
}
