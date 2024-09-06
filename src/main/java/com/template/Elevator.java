package com.template;

public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;
    private final int maxPassengers;
    private int currentPassengers;

    // Constructor
    public Elevator(int minFloor, int maxFloor, int maxPassengers) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPassengers = maxPassengers;
        this.currentFloor = minFloor;
        this.currentPassengers = 0;
    }

    public void moveToFloor(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            this.currentFloor = floor;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }


    public void addPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++;
        }
    }

    public void removePassenger() {
        if (currentPassengers > 0) {
            currentPassengers--;
        }
    }
    
    public int getPassengerCount() {
        return currentPassengers;
    }
}