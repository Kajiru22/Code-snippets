package io.everyonecodes_consolidation2.drivers.Data;
import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class Driver {

    @Id
    private String id;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "Car type is required")
    private String carType;
    private boolean available;

    public Driver(String username, String password, String carType) {
        this.username = username;
        this.password = password;
        this.carType = carType;
        this.available = false;
    }

    public Driver() {
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return available == driver.available && Objects.equals(id, driver.id) && Objects.equals(username, driver.username) && Objects.equals(password, driver.password) && Objects.equals(carType, driver.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, carType, available);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", carType='" + carType + '\'' +
                ", available=" + available +
                '}';
    }
}
