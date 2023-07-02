import java.util.List;

public class Order {

    Cone cone;
    List<Scoope> scopes;

    public double getPrice() {
        double totalPrice = 0;
        for (Scoope scope:scopes) {
            totalPrice += scope.getPrice();
        }
        totalPrice += cone.getPrice();
        return totalPrice;
    }
}
