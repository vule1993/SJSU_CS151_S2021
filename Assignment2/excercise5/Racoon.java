public class Racoon extends Animal implements Scratcher {
    public Racoon(String animalType, String animalName, int animalAge, String animalGender, String animalEnvironment, double animalSpeed) {
        super(animalType, animalName, animalAge, animalGender, animalEnvironment, animalSpeed);
    }

    @Override
    public void scratch() {
        System.out.println("Racoons love scratching.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Racoon eat nuts and veggie");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Racoon sleep at Tree");
    }
}
