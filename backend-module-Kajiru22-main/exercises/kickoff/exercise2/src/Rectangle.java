import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is a rectangle with width " + width + " and height " + height + ":\n" + getStringShape();
    }

    @Override
    public List<List<Character>> getShape() {
        List<Character> listWidth = new ArrayList<>();
        List<List<Character>> shape = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            listWidth.add('*');
        }
        for (int i = 0; i < height; i++) {
            shape.add(listWidth);
        }
        return shape;
    }
}

