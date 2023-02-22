package HomeworkCorrect.Homework2true.Euro;

public class AppConverter {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        double exchangeRateUsdToEuro = ui.userInputDouble("Please enter exchange rate USD to EURO: ");

        boolean correctChoose = true;
        double amountAfterConvert = 0; //присваиваем 0, чтобы инициализировать переменную


        String message = "Please choose your type of operations: \n"+
                "1. Convert USD to EURO \n"+
                "2. Convert EURO to USD \n";

        while (correctChoose) {

            int choose = ui.userInputInteger(message);

// можно было сделать и со switch, даже будет проще

            if (choose == 1) {
                amountAfterConvert = amountAfterConvert("USD", exchangeRateUsdToEuro);
                correctChoose = false;
            } else if (choose == 2) {
                amountAfterConvert = amountAfterConvert("EURO", 1/exchangeRateUsdToEuro);
                 correctChoose = false;
            } else {
                System.out.println("Incorrect choose. Please enter again. ");
                System.out.println("--------------------------------------");
            }

        }

        System.out.println("Amount after converting " + amountAfterConvert);

    }

    //чтоб не писать метод внутри if, мы вытащили и разместили его ниже:

    public static double amountAfterConvert(String currency, double exchangeRate){
        UserInput ui = new UserInput();
        Converter converter = new Converter();
        double currencyAmount = ui.userInputDouble("Please enter amount of " + currency);
        System.out.println("Source currency " + currencyAmount + " " + currency);
        return converter.converter(currencyAmount,exchangeRate);

    }
}
