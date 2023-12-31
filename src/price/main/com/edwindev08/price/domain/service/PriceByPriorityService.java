package com.edwindev08.price.domain.service;

import com.edwindev08.price.domain.port.dao.PriceDao;
import com.edwindev08.price.domain.model.entity.Price;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PriceByPriorityService {

    private final PriceDao priceDao;

    public PriceByPriorityService(PriceDao priceDao) {
        this.priceDao = priceDao;
    }

    public List<Price> getPricesByPriority(
            LocalDateTime startDate, Long productId, Long brandId) {

        return priceDao.getPricesByStartDateProductIdAndBrandId(startDate, productId, brandId)
                .stream()
                .filter(price -> price.getStartDate().isBefore(startDate) &&
                        price.getEndDate().isAfter(startDate))
                .collect(Collectors.groupingBy(Price::getPriority))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .orElse(null);

    }
}
