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

    //    skip this test to demo CONDITIONALS_BOUNDARY mutants
    @Test
    @DisplayName("Should return True given 100")
    void oneHundred_isValid_returnsTrue() {
        assertThat(cut.isValid(100)).isTrue();
    }

    //    skip this test to demo CONDITIONALS_BOUNDARY mutants
    @Test
    @DisplayName("Should return false given 0")
    void zero_isValid_returnsFalse() {
        assertThat(cut.isValid(0)).isFalse();
    }


    /**
     * {@link RangeValidator#classifyScore(int)} (int, int, int)}
     */

    @Test
    @DisplayName("Invalid case in classifyScore")
    void scalene_valid(){
        assertThat(cut.classifyScore(-5)).isEqualTo("Invalid");
        assertThat(cut.classifyScore(110)).isEqualTo("Invalid");
    }

    @Test
    @DisplayName("Valid case in classifyScore")
    void equilateral_valid(){
        assertThat(cut.classifyScore(90)).isEqualTo("A");
        assertThat(cut.classifyScore(80)).isEqualTo("B");
        assertThat(cut.classifyScore(70)).isEqualTo("C");
        assertThat(cut.classifyScore(60)).isEqualTo("D");
        assertThat(cut.classifyScore(50)).isEqualTo("F");
    }

    //    skip this test to demo CONDITIONALS_BOUNDARY mutants
    @Test
    @DisplayName("Valid boundary case in classifyScore")
    void equilateral_valid_boundary(){
        assertThat(cut.classifyScore(100)).isEqualTo("A");
        assertThat(cut.classifyScore(89)).isEqualTo("B");
        assertThat(cut.classifyScore(79)).isEqualTo("C");
        assertThat(cut.classifyScore(69)).isEqualTo("D");
        assertThat(cut.classifyScore(0)).isEqualTo("F");
    }

}
