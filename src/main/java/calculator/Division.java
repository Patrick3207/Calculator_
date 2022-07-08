package calculator;

public class Division implements CalculationFactory {

    @Override
    public double calculate(int value1, int value2) {
        if (value2 == 0.0) {
            try {
                return value1 / 0;
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Can´t divide by ZERO");
            }

        }
  /*  double res = 0;
          try {
              res = value1/value2;
          }
          catch (ArithmeticException arithmeticException){
              arithmeticException.printStackTrace();

          }
          finally {
              return res;
          }
    } */

            return (double) value1 / value2;
    }
}

