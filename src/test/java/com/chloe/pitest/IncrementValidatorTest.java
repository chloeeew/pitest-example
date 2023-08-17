package com.chloe.pitest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncrementValidatorTest {
    private IncrementValidator cut;

    @BeforeEach
    void setUp(){
        cut = new IncrementValidator();
    }

    /**
     * {@link IncrementValidator#incrementNumber(int)}
     */

    @Test
    @DisplayName("Should return 2 given 1")
    void from_one_increment_to_two(){
        assertThat(cut.incrementNumber(1)).isEqualTo(2);
    }

    @Test
    @DisplayName("Should return 0 given 1")
    void from_one_decrement_to_zero(){
        assertThat(cut.decrementNumber(2)).isEqualTo(1);
    }


}
