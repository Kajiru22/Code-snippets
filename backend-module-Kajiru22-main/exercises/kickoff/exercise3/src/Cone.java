import java.util.Optional;

public interface Cone {

    int getMaxCapacity();

    double getPrice();

    public static Object stringOf(String coneName) {
        if(coneName.equals("kid_cone")) {
            return new KidCone();
        }
        if (coneName.equals(("waffel_one"))) {
            return new WaffelCone();
        }
        if (coneName.equals("plastic_bowl")) {
            return new PlasticBowl();
        }
        else {
            return Optional.empty();
        }

    }
}
