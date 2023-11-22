package com.edwindev08.price.infrastructure.adapter.mapper;

import com.edwindev08.price.infrastructure.adapter.entity.PriceEntity;
import com.edwindev08.price.domain.model.entity.Price;
import org.springframework.stereotype.Component;

@Component
public class PriceDboMapper {

    public Price toDomain(PriceEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Price(
                entity.getId(),
                entity.getBrandId(),
                entity.getStartDate(),
                entity.getEndDate(),
                entity.getPriceList(),
                entity.getProductId(),
                entity.getPriority(),
                entity.getPrice(),
                entity.getCurrency()
        );
    }

}
