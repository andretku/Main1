package javaHomework.Homework1.Calculator;

import java.util.Scanner;

public class CalcUserInput {

    public double userDouble() {
        Scanner scanner = new Scanner(System.in);
        double doubleInput = scanner.nextInt();
        return doubleInput;
    }

    public String userSymbol() {
        Scanner scanner = new Scanner(System.in);
        String operSymbol = scanner.nextLine();
        return operSymbol;
    }

}
