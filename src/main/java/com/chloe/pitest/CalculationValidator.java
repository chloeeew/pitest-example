package com.chloe.pitest;

import java.util.Objects;

public class CalculationValidator {

    double sum(Double a, Double b){
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        return a+b;
    }

    double sub(Double a, Double b){
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        return a-b;
    }

}
