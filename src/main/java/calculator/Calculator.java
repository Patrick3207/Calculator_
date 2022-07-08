package calculator;

public class Calculator {

  public static CalculationFactory calculator(String operate){
  switch (operate) {
      case "+":
          return new Addition();
      case "-":
          return new Subtraction();
      case "*":
          return new Multiply();
      case "/":
          return new Division();
      default:
          throw new UnsupportedOperationException(String.format("Unsupported operation type"));
  }
  }
}