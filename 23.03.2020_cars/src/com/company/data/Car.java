package com.company.data;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int productionYear;
    private Color color;
    private Engine engine;
    private Dimension dimension;

    public Car(String brand, String model, int productionYear, Color color, Engine engine, Dimension dimension) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.engine = engine;
        this.dimension = dimension;
    }

    public Car(String brand, String model, int productionYear, Color color, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.engine = engine;
    }

    public Car(String brand, String model, int productionYear, Color color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getProductionYear() { return productionYear; }
    public Color getColor() { return color; }
    public Engine getEngine() { return engine; }
    public Dimension getDimension() { return dimension; }
    public void setColor(Color color) { this.color = color; }
    public void setEngine(Engine engine) { this.engine = engine; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(dimension, car.dimension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, color, engine, dimension);
    }

    @Override
    public String toString() {
        return "Car {" + brand + " " + model + " " +  productionYear + " " +  color +
         //       " " +  engine + " " +  dimension +
                "}";
    }

}
