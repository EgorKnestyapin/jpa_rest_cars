package de.aittr.cars.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private double price;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Double.compare(price, car.price) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, price);
    }

    @Override
    public String toString() {
        return "JpaCar{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
