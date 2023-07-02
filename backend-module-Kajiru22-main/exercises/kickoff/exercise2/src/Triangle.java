import java.util.ArrayList;
import java.util.List;

public class Triangle extends Shape {
    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is a triangle with the height " + height + ":\n" + getStringShape();
    }

    @Override
    public List<List<Character>> getShape() {
        List<List<Character>> result = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            List<Character> row = new ArrayList<>();
            for (int j = 0; j < 2 * height - 1; j++) {
                if (j >= height - i - 1 && j <= height - 1 + i) {
                    row.add('*');
                } else {
                    row.add(' ');
                }
            }
            result.add(row);
        }
        return result;
    }
}