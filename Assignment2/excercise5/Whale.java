public class Whale extends Animal implements Swimmer {
    private int fins;

    public Whale(String animalType, String animalName, int animalAge, String animalGender, String animalEnvironment, double animalSpeed, int fins) {
        super(animalType, animalName, animalAge, animalGender, animalEnvironment, animalSpeed);
        this.fins = fins;
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("they swim in the ocean.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("They eats smaller fishes.");
    }
}
