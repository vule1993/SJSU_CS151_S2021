import java.util.ArrayList;

public class Shapes {
    ArrayList<Shape> shapeList;//This class should have at least one constructor implemented.
    public Shapes() {
        shapeList = new ArrayList<>();
    }

    //Add the ability to add and remove objects from this attribute using methods add() and remove().
    public Shapes(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void add(Shape shape) {
        shapeList.add(shape);
    }

    public void remove(Shape shape) {
        shapeList.remove(shape);
    }

    //implement a getter and a setter for shapeList.*/

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    //Implement a synchronized public method called compute()
    synchronized public void compute() {

        System.out.println("Shape List:");
        for (Shape shape : shapeList) {
            shape.start();
        }
    }

    public Shape max() {
        double maxArea = -1;
        Shape maxShape = null;

        for (Shape shape : shapeList) {
            //if the area is > maxArea
            if (shape.computeArea() > maxArea) {
                //we have a new max area
                maxArea = shape.computeArea();
                //save the shape
                maxShape = shape;
            }
        }
        //return the shape
        return maxShape;
    }

    public Shape min() {
        double minArea = 1000000;
        Shape minShape = null;

        for (Shape shape : shapeList) {
            //if the area is < minArea
            if (shape.computeArea() < minArea) {
                //we have a new min area
                minArea = shape.computeArea();
                //save the shape
                minShape = shape;
            }
        }
        //return the shape
        return minShape;
    }

}
