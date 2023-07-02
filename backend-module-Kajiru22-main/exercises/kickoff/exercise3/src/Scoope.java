import java.util.Optional;

public interface Scoope {

    double getPrice();

    Flavor getFlavor();

    public static Optional<Object> stringOf(String flavor) {
        if(flavor.equals("currant")) {
            return Optional.of(new Currant());
        }
        if (flavor.equals(("grapefruit"))) {
            return Optional.of(new Grapefruit());

        }
        if (flavor.equals(("lemon"))) {
            return Optional.of(new Lemon());

        }
        if (flavor.equals(("strawberry"))) {
            return Optional.of(new Strawberry());

        }
        if (flavor.equals(("vanilla"))) {
            return Optional.of(new Vanilla());
        }
        else {
            return Optional.empty();
        }
    }
    
}
