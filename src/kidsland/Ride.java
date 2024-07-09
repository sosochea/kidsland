/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kidsland;

/**
 *
 * @author Cheas
 */
public class Ride {
    private int rideId;
    private String name;
    private String description;
    private double price;
    private String availabilityStatus;

    public Ride(int rideId, String name, String description, double price, String availabilityStatus) {
        this.rideId = rideId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    public boolean getAvailability() {
       
        return availabilityStatus.equals("Available");
    }

    public void updateAvailability(String status) {
        
        this.availabilityStatus = status;
    }

   
}
