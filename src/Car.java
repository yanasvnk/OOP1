public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String colour;
    public int year;
    public String country;

    public Car(String brand, String model, double engineVolume, String colour, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.year = year;
        this.country = country;
        // Домашнее азадние 3
        // Задача 2
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (colour == null) {
            this.colour = "белый";
        } else {
            this.colour = colour;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }
}