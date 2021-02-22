public class Cat extends Animal implements Domesticated,Scratcher{
    private String eyeColor;

    public Cat(String animalType, String animalName, int animalAge, String animalGender, String animalEnvironment, double animalSpeed, String eyeColor) {
        super(animalType, animalName, animalAge, animalGender, animalEnvironment, animalSpeed);
        this.eyeColor = eyeColor;
    }
    Override
    public void walk(){
        System.out.println("Cats love walking.");
    }
    @Override
    public void greetHuman(){
        System.out.println("Cats love greeting human.");
    }

    @Override
    public void scratch() {
        System.out.println("Cats love scratching.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat eat fishes.");
    }

}
