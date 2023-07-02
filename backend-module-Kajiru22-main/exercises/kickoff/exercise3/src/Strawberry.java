public class Strawberry implements Scoope{
    @Override
    public double getPrice() {
        return 1.30;
    }

    @Override
    public Flavor getFlavor() {
        return Flavor.SWEET;
    }
}
