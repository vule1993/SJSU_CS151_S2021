public class Triangle extends Shape{
    public Triangle(double width) {
        super(width);
    }

    @Override
    public double computeArea() {
        return Math.sqrt(3) * Math.pow(getWidth(), 2) / 4;
    }

    @Override
    public String toString() {
        return ("Equilateral triangle with sides of: " + getWidth());
    }

    //computeArea using the thread
    @Override
    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());

    }

}
