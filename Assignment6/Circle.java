public class Circle extends Shape {
    public Circle(double width) {
        super(width);
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(getWidth(), 2);
    }

    @Override
    public String toString() {
        return ("Circle's radius: " + getWidth());
    }

    //computeArea using the thread
    @Override
    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());
    }
}
