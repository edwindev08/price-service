package com.edwindev08.price.domain.port.repository;

import com.edwindev08.price.domain.model.entity.Price;


public interface PriceRepositoryPort {

    Price create(Price request);
    void deleteById(Long id);
    Price update(Price request);

}
