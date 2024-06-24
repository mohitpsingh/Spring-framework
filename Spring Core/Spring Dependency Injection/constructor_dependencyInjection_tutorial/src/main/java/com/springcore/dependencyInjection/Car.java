package com.springcore.dependencyInjection;

public class Car {
    private String carBrand;
    private Integer carModelNumber;

    public Car(String carBrand) {
        this.carBrand = carBrand;
    }

    public Car(String carBrand, Integer carModelNumber) {
        this.carBrand = carBrand;
        this.carModelNumber = carModelNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModelNumber=" + carModelNumber +
                '}';
    }
}
