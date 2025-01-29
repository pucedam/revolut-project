package org.revolut;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorTest {

  @Test
  void testAddition() {
    Calculator calculator = new Calculator(null);
    int result = calculator.add(3, 2);
    assertThat(result).isEqualTo(5);
  }

  @Test
  void testSubtraction() {
    Calculator calculator = new Calculator(null);
    int result = calculator.subtract(5, 3);
    assertThat(result).isEqualTo(2);
  }

  @Test
  void testMultiplyUsingDependency() {
    // Mock the dependency
    CalculatorDependency dependency = mock(CalculatorDependency.class);
    when(dependency.multiply(3, 4)).thenReturn(12);

    // Inject the mock into the Calculator
    Calculator calculator = new Calculator(dependency);

    // Perform the test
    int result = calculator.multiplyUsingDependency(3, 4);

    // Assert the result using AssertJ
    assertThat(result).isEqualTo(12);

    // Verify that the dependency was called with the correct parameters
    Mockito.verify(dependency, times(1)).multiply(3, 4);
  }
}