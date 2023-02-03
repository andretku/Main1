package lesson3.dogs;

public class Dog {
    String name;
    int age;

    public void voice(){                //метод, который выводит на экран данное сообщение
        System.out.println("Gav!");
        System.out.println("My age is " + age);
    }

    public void say(String message){
        System.out.println(message);
    }

}
