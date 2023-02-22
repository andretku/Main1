package HomeworkCorrect.Homework2true.Colby;

public class ColbaDemoTrue {
    public static void main(String[] args) {

    UserInput ui = new UserInput();         //подключаем ввод значений пользователем
    Colby colby = new Colby(100,100);

    //не используя переменные, можно сразу передать полученные значения в Colby
    colby.setTemp1(ui.userInputInteger("Please, enter first temp parameter"));
    colby.setTemp2(ui.userInputInteger("Please, enter second temp parameter"));

    //или можно было сделать точно так же, но через переменную:
//        int temp1 = ui.userInputInteger("Please, enter first temp parameter");
//        colby.setTemp1(temp1);
//        int temp2 = ui.userInputInteger("Please, enter second temp parameter");
//        colby.setTemp2(temp2);

        colby.printResult();


    }
}
