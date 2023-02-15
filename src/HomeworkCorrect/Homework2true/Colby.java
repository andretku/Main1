package HomeworkCorrect.Homework2true;

// ЗАДАНИЕ: есть две колбы с разными температурами жидкости. Проверить, если впервой колбе
// темпер больше 100, а во второй - меньше 100, то прибор работает правильно
// добавили Colby, UserInput и основной класс ColbaDemoTrue
// идеально работающее решение, но довольно громоздкое
// даже добавили не сравнение со 100 градусами, а
// переменные range, которым передаем значение из ColbaDemoTrue
public class Colby {

    //вводим две переменные с температурой
    private int temp1;
    private int temp2;

    // добавляем две переменные сравнения
    private int rangeForFirst;
    private int rangeForSecond;

    //создали конструктор, и когда подключаем метод в ColbaDemoTrue, там сразу указываем 100 и 100
    public Colby(int rangeForFirst, int rangeForSecond) {
        this.rangeForFirst = rangeForFirst;
        this.rangeForSecond = rangeForSecond;
    }

    // еще добавляем Setter:
    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }
    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }

    //добавлем основной метод для проверки условия, поставили его private, чтоб никто его
    // не видел и не мог обратиться
    private boolean checkResult(){
        return (temp1 > rangeForFirst) && (temp2 < rangeForSecond);
    }

    //распечатываем результат
    public void printResult() {
        System.out.println("Your system works correctly - " + checkResult());
    }
}
