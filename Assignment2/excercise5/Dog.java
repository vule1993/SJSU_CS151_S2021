
public class Dog extends Animal implements Domesticated {
    private String hairStyle;
    public Dog(String animalType, String animalName, int animalAge, String animalGender, String animalEnvironment, double animalSpeed, String hairStyle) {
        super(animalType, animalName, animalAge, animalGender, animalEnvironment, animalSpeed);
        this.hairStyle = hairStyle;
    }
    @Override
    public void walk() {
        System.out.println("Dogs walk by 4 legs.");
    }
    Override
    public void greetHuman(){
        System.out.println("Dogs love greeting human.");
    }
    Override
    public void bark(){
        System.out.println("Dogs love barking.");
    }

    @Override
    public void sound(String sound) {
        super.sound(sound);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog chew the food");
    }

}
