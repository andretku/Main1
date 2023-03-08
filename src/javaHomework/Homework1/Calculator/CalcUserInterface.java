package javaHomework.Homework1.Calculator;

public class CalcUserInterface {
    public static void main(String[] args) {

        CalcUserInput calcUserInput = new CalcUserInput();
        CalcOperations calcOperations = new CalcOperations();

        System.out.print("Please, write the first number: ");
        double x1 = calcUserInput.userDouble();

        System.out.print("Please, write the second number: ");
        double x2 = calcUserInput.userDouble();

        System.out.print("What should I do? Write a symbol of operation: ");
        String symbol = calcUserInput.userSymbol();

 /*       if (symbol == "+"){                                     //не работает определение символа...
            double resultSum = calcOperations.summary(x1, x2);
            System.out.printf("The result of addition will be - " + resultSum);
        } else if (symbol == "-"){
            double resultSubtract = calcOperations.subtract(x1, x2);
            System.out.printf("The result of subtraction will be - " + resultSubtract);
        } else if (symbol == "*"){
            double resultMultipl = calcOperations.multiplic(x1, x2);
            System.out.printf("The result of multiplication will be - " + resultMultipl);
        } else if (symbol == "/"){
            double resultDiv = calcOperations.division(x1, x2);
            System.out.printf("The result of subtraction will be - " + resultDiv);
        } else {
            System.out.println("You do something wrong! I'm switching off!");
        }
*/
        switch (symbol){
            case "+":
                double resultSum = calcOperations.summary(x1, x2);
                System.out.printf("The result of addition will be - " + resultSum);
                break;
            case "-":
                double resultSubtract = calcOperations.subtract(x1, x2);
                System.out.printf("The result of subtraction will be - " + resultSubtract);
                break;
            case "*":
                double resultMultipl = calcOperations.multiplic(x1, x2);
                System.out.printf("The result of multiplication will be  " + resultMultipl);
                break;
            case "/":
                double resultDiv = calcOperations.division(x1, x2);
                System.out.printf("The result of subtraction will be - " + resultDiv);
                break;
            default:
                System.out.println("You do something wrong! I'm switching off!");
        }
    }
}
