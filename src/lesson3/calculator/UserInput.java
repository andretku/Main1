package lesson3.calculator;

import java.util.Scanner;

public class UserInput {

    public int userInputInteger(){
        Scanner scanner = new Scanner(System.in);   // команда считывания ввода с клавиатуры
        int intInput = scanner.nextInt();           //nextInt - функция считывания ввода, уже встроенная в Яву
        return intInput;

    }
}