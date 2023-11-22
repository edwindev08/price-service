package com.edwindev08.price.domain.port.dao;

import com.edwindev08.price.domain.model.entity.Price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceDao {
    List<Price> getPricesByStartDateProductIdAndBrandId(
            LocalDateTime startDate, Long productId, Long brandId
    );

}
