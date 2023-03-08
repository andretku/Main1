package javaHomework.Homework1.Exchange;

public class UserInterface {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        // вываливается ошибка, когда вводишь дробное число (и с запятой, и с точкой) - прошу помощи
        // если вводишь целое - пропускает

        System.out.print("Please, write sum of dollars: ");
        double dollars = userInput.userDouble();

        System.out.print("Please, write exchange rate of euro: ");
        double exchange = userInput.userDouble();


        double resultEuro = dollars * exchange;
        System.out.printf("You will get ---> " + resultEuro + " <---");



    }
}
