package org.revolut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  private final CalculatorDependency dependency;

  public Calculator(CalculatorDependency dependency) {
    this.dependency = dependency;
  }

  public int add(int a, int b) {
    logger.info("Add");
    return a + b;
  }

  public int subtract(int a, int b) {
    logger.info("Subtract");
    return a - b;
  }

  public int multiplyUsingDependency(int a, int b) {
    logger.info("Multiply");
    return dependency.multiply(a, b);
  }
}