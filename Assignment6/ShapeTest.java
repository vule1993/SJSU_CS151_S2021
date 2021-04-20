public class ShapeTest {
    public static void main(String[] args) {
       //Exercise1
        Shapes shape = new Shapes();
        shape.add(new Hexagon(3.0));
        shape.add(new Hexagon(4.0));
        shape.add(new Circle(3));
        shape.add(new Circle(9));
        shape.add(new Triangle(4));
        shape.add(new Triangle(6));
        shape.add(new Rectangle(3, 2));
        shape.add(new Rectangle(9, 5));

        shape.compute();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

        //Exercise2
        System.out.println("\nMax:\n" + shape.max().toString());

        System.out.println("\nMin:\n" + shape.min().toString());



    }
}
