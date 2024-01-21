package com.fit.se.controller;

import com.fit.se.dto.ProductDTO;
import com.fit.se.dto.UserDTO;
import com.fit.se.model.Product;
import com.fit.se.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/product")
    public ResponseEntity<List<ProductDTO>> getAPIGateWay(){
        RestTemplate restTemplate = new RestTemplate();
        String request = "http://localhost:8181/api/v1/users";
        UserDTO[] userDTOS = restTemplate.getForObject(request,UserDTO[].class);
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (int i = 0; i< Objects.requireNonNull(userDTOS).length; i++){
            UserDTO userDTO = userDTOS[i];
            Product product = products.get(i);
            ProductDTO productDTO = ProductDTO.builder()
                    .productId(product.getId())
                    .userId(userDTO.getId())
                    .firstName(userDTO.getFirstName())
                    .lastName(userDTO.getLastName())
                    .name(product.getName())
                    .price(product.getPrice())
                    .build();
            productDTOS.add(productDTO);
        }
        return ResponseEntity.ok(productDTOS);
    }
}
