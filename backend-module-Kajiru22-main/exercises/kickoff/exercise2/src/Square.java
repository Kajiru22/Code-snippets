import java.util.ArrayList;
import java.util.List;
    public class Square extends Shape {
        private int size;

        public Square(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "This is a square with size " + size + ":\n" + getStringShape();
        }

        @Override
        public List<List<Character>> getShape() {
            List<Character> row = new ArrayList<>();
            List<List<Character>> shape = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                row.add('*');
            }
            for (int i = 0; i < size; i++) {
                shape.add(row);
            }
            return shape;
        }
    }