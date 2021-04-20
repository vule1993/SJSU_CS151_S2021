public abstract class Shape extends Thread {
    private double width;

    protected Shape(double width) {
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double computeArea();

}

