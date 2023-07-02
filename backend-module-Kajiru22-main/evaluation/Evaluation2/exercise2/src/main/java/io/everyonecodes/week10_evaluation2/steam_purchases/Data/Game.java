package io.everyonecodes.week10_evaluation2.steam_purchases.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private double price;
    @OneToMany(mappedBy = "game")
    private Set<Purchase> purchases = new HashSet<>();

    public Game() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(game.price, price) == 0 && Objects.equals(id, game.id) && Objects.equals(name, game.name) && Objects.equals(purchases, game.purchases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, purchases);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", purchases=" + purchases +
                '}';
    }
}
