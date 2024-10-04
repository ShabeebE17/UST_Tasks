package com.ust.LaptopRecommender.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Laptop Recommender API",
                version = "1.0",
                description = "API for recommending laptops based on budget and model"
        )
)
public class SwaggerConfig {
}