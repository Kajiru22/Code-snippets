import java.util.List;

import java.util.stream.Collectors;

public abstract class Shape {
    public abstract List<List<Character>> getShape();

    public String getStringShape() {
        return getShape().stream()
                        .map(row -> row.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining("  ")))
                        .collect(Collectors.joining("\n"));
    }
}