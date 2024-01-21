package com.fit.se;

import com.fit.se.model.Order;
import com.fit.se.repository.OrderRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestOrderApplication.class, args);
    }

//    @Autowired
//    OrderRepository orderRepository;
//
//    @Bean
//    CommandLineRunner  commandLineRunner(){
//        return args -> {
//            Faker faker = new Faker();
//            for(int  i = 0;i<10;i++){
//                Order order = Order.builder()
//                        .totalPrice(Double.parseDouble(faker.commerce().price()))
//                        .build();
//                orderRepository.save(order);
//            }
//        };
//    }

}
