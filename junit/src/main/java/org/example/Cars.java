package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Cars {

    private  String branch;
    private String model;
    private LocalDate year;
    private String color;
    private Double price;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cars(String branch, String model, LocalDate year, String color, Double price) {
        this.branch = branch;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "org.example.Cars{" +
                "branch='" + branch + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Objects.equals(branch, cars.branch) && Objects.equals(model, cars.model) && Objects.equals(year, cars.year) && Objects.equals(color, cars.color) && Objects.equals(price, cars.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, model, year, color, price);
    }

}
