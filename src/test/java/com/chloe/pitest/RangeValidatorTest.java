package com.chloe.pitest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RangeValidatorTest {

    private RangeValidator cut;

    @BeforeEach
    void setUp() {
        cut = new RangeValidator();
    }

    /**
     * {@link RangeValidator#isValid(int)}
     */

    @Test
    @DisplayName("Should return true given 50")
    void fifty_isValid_returnsTrue() {
        assertThat(cut.isValid(50)).isTrue();
    }

    @Test
    @DisplayName("Should return false given 200")
    void twoHundred_isValid_returnsFalse() {
        assertThat(cut.isValid(200)).isFalse();
    }

    @Test
    @DisplayName("Should return True given 100")
    void oneHundred_isValid_returnsTrue() {
        assertThat(cut.isValid(100)).isTrue();
    }

    @Test
    @DisplayName("Should return false given 0")
    void zero_isValid_returnsFalse() {
        assertThat(cut.isValid(0)).isFalse();
    }



    /**
     * {@link RangeValidator#typeOfTriangle(int, int, int)}
     */

    @Test
    @DisplayName("Should return scalene given 3,4,5")
    void scalene_valid(){
        assertThat(cut.typeOfTriangle(3,4,5)).isEqualTo("Scalene");
    }

    @Test
    @DisplayName("Should return Equilateral given 1,1,1")
    void equilateral_valid(){
        assertThat(cut.typeOfTriangle(1,1,1)).isEqualTo("Equilateral");
    }

    @Test
    @DisplayName("Should return Isosceles given 3,3,4")
    void isosceles_valid(){
        assertThat(cut.typeOfTriangle(3,3,4)).isEqualTo("Isosceles");
    }


}
