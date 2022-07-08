package calculator;

public class Multiply implements CalculationFactory {
    @Override
    public double calculate(int value1, int value2){
        return (value1 * value2);
    }
}

