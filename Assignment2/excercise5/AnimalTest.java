public class AnimalTest {
    public static void main(String [] args){
        Dog dog = new Dog("Dog", "Lucy", 3, "female", "home", 15, "silly");
        dog.eat();
        dog.move(15);
        dog.sound("gruhh");
        dog.bark();
        dog.walk();
        dog.greetHuman();
        System.out.println("----------------------------------------------------------------------------");

        Cat cat = new Cat("Cat", "Lilly", 2,"female","home", 20, "black");
        cat.eat();
        cat.move(20);
        cat.walk();
        cat.greetHuman();
        cat.scratch();
        System.out.println("----------------------------------------------------------------------------");


        Racoon racoon = new Racoon("Racoon", "Race", 1, "male", "forest", 3);
        racoon.eat();
        racoon.scratch();
        System.out.println("----------------------------------------------------------------------------");

        Whale whale = new Whale("Whale", "baby whale", 15, "female", "ocean",15,4);

        whale.eat();
        whale.swim();
        whale.move(15);

    }
}
