package com.edwindev08.price.application.query;

import com.edwindev08.price.application.mapper.PriceDtoMapper;
import com.edwindev08.price.domain.model.dto.PriceDto;
import com.edwindev08.price.domain.service.PriceByPriorityService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class PriceByIdsAndDateHandler {
    private final PriceByPriorityService priceByPriorityService;
    private final PriceDtoMapper mapper;

    public PriceByIdsAndDateHandler(PriceByPriorityService priceByPriorityService, PriceDtoMapper mapper) {
        this.priceByPriorityService = priceByPriorityService;
        this.mapper = mapper;
    }

    public Optional<PriceDto> execute(LocalDateTime startDate, Long productId, Long brandId) {

        return priceByPriorityService.getPricesByPriority(startDate, productId, brandId)
                .stream()
                .findFirst()
                .map(mapper::toDto);
    }

}
