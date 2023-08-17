package com.chloe.pitest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CalculationValidatorTest {
    private CalculationValidator cut;

    @BeforeEach
    void setUp() {
        cut = new CalculationValidator();
    }

    @Test
    @DisplayName("Should return 2.2 given 1.1 and 1.1")
    void sum_double_number() {
        assertThat(cut.sum(1.1, 1.1)).isEqualTo(2.2);
    }

    @Test
    @DisplayName("Should return 0 given 2.0 and 2.0")
    void sub_double_number() {
        assertThat(cut.sub(2.0, 2.0)).isEqualTo(0.0);
    }

    @Test
    @DisplayName("Should return 0 given 0.0 and 0.0")
    void sub_double_number_zero() {
        assertThat(cut.sub(5d, 1d)).isEqualTo(4d);
    }



}
