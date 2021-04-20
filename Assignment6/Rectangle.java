public class Rectangle extends Shape {
    private double length;
    public Rectangle(double width, double height) {
        super(width);
        this.length = height;
    }
    @Override
    public double computeArea() {
        return getWidth() * getLength();
    }
    @Override
    public String toString() {
        return ("Rectangle's Width: " + getWidth() + " + Length: " + getLength());
    }

    //computeArea using the thread
    @Override
    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
