package calculator;

public class Main {
    public static void main(String[] args) {

        CalculationFactory calculationAddition = Calculator.calculator("+");
        CalculationFactory calculationSubtraction = Calculator.calculator("-");
        CalculationFactory calculationMultiply = Calculator.calculator("*");
        CalculationFactory calculationDivision = Calculator.calculator("/");


       System.out.println(calculationAddition.calculate(5, 4));
        System.out.println(calculationSubtraction.calculate(8, 2));
        System.out.println(calculationMultiply.calculate(5, 4));
        System.out.println(calculationDivision.calculate(8, 0));
    }
}
