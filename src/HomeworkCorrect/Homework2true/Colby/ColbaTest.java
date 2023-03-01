package HomeworkCorrect.Homework2true.Colby;

public class ColbaTest {            // проводим тесты по правильной работе методов в классе Colby
                                    // тесты пишем мы сами, для данного метода их нужно 4
                                    // на пограничных состояниях
    public static void main(String[] args) {
        Colby colbaTest = new Colby(100,100);


        //----------- TEST1 -------

        colbaTest.setTemp1(100);
        colbaTest.setTemp2(100);

        boolean expectedResult = false;                 //ожидаемый результат при работе программы
        boolean actualResult = colbaTest.checkResult(); //результат после теста

        if (expectedResult == actualResult){
            System.out.println("Test 1 is OK!");
        } else {
            System.out.println("Test 1 is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }

        //----------- TEST2 -------

        colbaTest.setTemp1(110);
        colbaTest.setTemp2(90);

        expectedResult = true;
        actualResult = colbaTest.checkResult();

        if (expectedResult == actualResult){
            System.out.println("Test 2 is OK!");
        } else {
            System.out.println("Test 2 is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }

    }
}
