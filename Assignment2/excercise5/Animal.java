public class Animal {
    private String animalType;
    private String animalName;
    private int animalAge;
    private String animalGender;
    private String animalEnvironment;
    private double animalSpeed;

    public Animal(String animalType, String animalName, int animalAge, String animalGender, String animalEnvironment, double animalSpeed) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalGender = animalGender;
        this.animalEnvironment = animalEnvironment;
        this.animalSpeed = animalSpeed;
    }

    public void move(int speed){
        System.out.println("their moving speed at " + speed +" mph.");
    }

    public void sound(String sound){
        System.out.println("their sound likes " + sound);
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public String toString() {
        return animalType + animalAge + animalName + animalGender + animalEnvironment + animalSpeed;
    }
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public String getAnimalEnvironment() {
        return animalEnvironment;
    }

    public void setAnimalEnvironment(String animalEnvironment) {
        this.animalEnvironment = animalEnvironment;
    }

    public double getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(double animalSpeed) {
        this.animalSpeed = animalSpeed;
    }
    
}
