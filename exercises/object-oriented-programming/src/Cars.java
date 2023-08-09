package com.cbfacademy;


public class Cars {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Instantiate three car objects
        Car volvoV40 = new Car("Volvo", "V40", 2021);
        Car porschePanamera = new Car("Porsche", "Panamera", 2009);
        Car audiA3 = new Car("Audi", "A3", 2018);

        // Test the methods by printing the car details
        System.out.println("Car 1: " + volvoV40.getMake() + " " + volvoV40.getModel() + " from " + volvoV40.getYear());
        System.out.println("Car 2: " + porschePanamera.getMake() + " " + porschePanamera.getModel() + " from " + porschePanamera.getYear());
        System.out.println("Car 3: " + audiA3.getMake() + " " + audiA3.getModel() + " from " + audiA3.getYear());
    }
 }

    

