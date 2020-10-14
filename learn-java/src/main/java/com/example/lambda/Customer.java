package com.example.lambda;

public class Customer {
    private String name;
    private int points;

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public Customer copyCustomer() {
        return new Customer(this.getName().toUpperCase(), this.getPoints());
    }
}
