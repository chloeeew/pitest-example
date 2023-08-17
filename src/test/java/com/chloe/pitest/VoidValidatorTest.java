package com.chloe.pitest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 class VoidValidatorTest {
     private VoidValidator cut;

     @BeforeEach
     void setUp() {
         cut = new VoidValidator();
     }

     /**
      * {@link VoidValidator#voidMethodValidate()}
      */

     @Test
     @DisplayName("Should equal to 5")
     void fifty_isValid_returnsTrue() {
         assertThat(cut.voidMethodValidate()).isEqualTo(5);
     }
}
