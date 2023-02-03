package lesson3.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperations calculatorOperations = new CalculatorOperations();

        int a = 5;
        int b = 10;

        int resultOfSum = calculatorOperations.sum(a,b);
        System.out.println(resultOfSum);

        int resultMinus = calculatorOperations.minus(b,a);
        System.out.println(resultMinus);

        int resultMulti = calculatorOperations.multiplicate(a,b);
        System.out.println(resultMulti);

        double resultDiv = calculatorOperations.divis(a,b);
        System.out.println(resultDiv);
    }
}
