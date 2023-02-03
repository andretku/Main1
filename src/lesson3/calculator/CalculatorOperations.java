package lesson3.calculator;

public class CalculatorOperations {         //класс называется с большой буквы, переменная - с маленькой

    public int sum(int xxx, int yyy){
        int sumOfBoth = xxx + yyy;
        return sumOfBoth;               //вместо двух строчек можно записать просто   return xxx + yyy;

    }

    public int minus(int param1, int param2){
        int resultMinus = param1 - param2;
        return resultMinus;
       }

    public int multiplicate(int param1, int param2){
        int resultMulti = param1 * param2;
        return resultMulti;
    }

    public double divis(int param1, int param2){
        double resultDiv = param1 / (double) param2;
        return resultDiv;
    }





}
