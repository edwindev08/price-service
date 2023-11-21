package com.edwindev08.price.domain.model.exception;

public class PriceNotFoundException extends RuntimeException {

    public PriceNotFoundException() {
        super("Price Not Found");
    }
}
