public class Application {

    public static void main(String[] args) {
        Shape shape = new Rectangle(1, 1);
        Shape shape2 = new Rectangle(2, 1);
        Shape shape3 = new Rectangle(4, 2);
        Shape shape4 = new Rectangle(10, 5);
        Shape shape5 = new Rectangle(3, 6);
        Shape shape6 = new Rectangle(1, 5);
        Shape shape7 = new Square(1);
        Shape shape8 = new Square(2);
        Shape shape9 = new Square(4);
        Shape shape10 = new Square(10);
        Shape shape11 = new Triangle(1);
        Shape shape12 = new Triangle(2);
        Shape shape13 = new Triangle(3);
        Shape shape14 = new Triangle(5);
        Shape shape15 = new Triangle(7);
        Shape shape16 = new Triangle(10);
        System.out.println(shape + "\n" + shape2 + "\n" + shape3 + "\n" + shape4 + "\n" + shape5 + "\n" + shape6 + "\n" + shape7
                + "\n" + shape8 + "\n" + shape9 + "\n" + shape10 + "\n" + shape11 + "\n" + shape12 + "\n" + shape13 + "\n" +
                shape14 + "\n" + shape15 + "\n" + shape16);
    }
}
