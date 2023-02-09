package javaHomework.Homework1;

public class UserWordInterface {
    public static void main(String[] args) {
        UserWordInput userWordInput = new UserWordInput();

        System.out.println("Input first word with even number of letters: ");

        String firstWord = userWordInput.twoWords();    //вводит 1 слово
        int numberOf1Letters = firstWord.length();      //считаем кол-во букв
        while (numberOf1Letters % 2 > 0) {              //если нечетное, то зацикливаем, пока не введет правильно
            System.out.println("There is a wrong number of letters! Please, rewrite it!");
            firstWord = userWordInput.twoWords();
            numberOf1Letters = firstWord.length();
        }

        System.out.println("Input second word with even number of letters: ");

        String secondWord = userWordInput.twoWords();
        int numberOf2Letters = secondWord.length();
        while (numberOf2Letters % 2 > 0) {              //если нечетное, то зацикливаем, пока не введет правильно
            System.out.println("There is a wrong number of letters! Please, rewrite it!");
            secondWord = userWordInput.twoWords();
            numberOf2Letters = secondWord.length();
        }

        String newWord1 = firstWord.substring(0,(numberOf1Letters / 2));
        String newWord2 = secondWord.substring((numberOf2Letters / 2),numberOf2Letters);

        System.out.println("---> "+ newWord1 + newWord2 + " <---");

    }

}
