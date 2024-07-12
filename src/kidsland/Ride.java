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
    public int rideId;
    public String name;
    public double price;
    public int quantite;
    public String availabilityStatus;
    public byte[] photo;
 
   

    public Ride(int rideId, String name, double price, int quantite, String availabilityStatus, byte[] photo) {
        this.rideId = rideId;
        this.name = name;
        this.price = price;
        this.quantite = quantite;
        this.availabilityStatus = availabilityStatus;
        this.photo = photo;
    }

    public boolean getAvailability() {
       
        return availabilityStatus.equals("Available");
    }

    public void updateAvailability(String status) {
        
        this.availabilityStatus = status;
    }

   
}
