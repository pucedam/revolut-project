package org.revolut;

public class Calculator {

  private final CalculatorDependency dependency;

  public Calculator(CalculatorDependency dependency) {
    this.dependency = dependency;
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiplyUsingDependency(int a, int b) {
    return dependency.multiply(a, b);
  }
}