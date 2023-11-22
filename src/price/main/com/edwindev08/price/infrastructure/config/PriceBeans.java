package com.edwindev08.price.infrastructure.config;

import com.edwindev08.price.domain.port.dao.PriceDao;
import com.edwindev08.price.domain.service.PriceByPriorityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PriceBeans {

    @Bean
    public PriceByPriorityService priceByPriorityService(PriceDao priceDao){
        return new PriceByPriorityService(priceDao);
    }
}
