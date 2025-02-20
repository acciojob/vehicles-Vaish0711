package com.driver;

public class Boat implements WaterVehicle {

    private String name;
    private int capacity;

    // Constructor to initialize name and capacity
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }
    // Implementing the getVehicleName() method from WaterVehicle interface
    @Override
    public String getVehicleName() {
        return name;  // Return the name of the boat
    }

    // Implementing the getVehicleCapacity() method from WaterVehicle interface
    @Override
    public int getVehicleCapacity() {
        return capacity;  // Return the capacity of the boat
    }
}
