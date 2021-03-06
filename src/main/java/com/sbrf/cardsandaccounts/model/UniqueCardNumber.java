package com.sbrf.cardsandaccounts.model;

import java.math.BigDecimal;

public class UniqueCardNumber {

    private final BigDecimal cardNumber;

    public UniqueCardNumber(BigDecimal cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "" + cardNumber;
    }
}
