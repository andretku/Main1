package lesson3.dogs;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Zeus";

        System.out.println(dog1.name);

        dog1.age = 2;
        dog1.voice();


       String message2 = "My name is " + dog1.name;

       dog1.say(message2);

        Dog dog2 = new Dog();
        dog2.name = "Markus";
        dog2.age = 4;
        dog2.voice();


    }

}
