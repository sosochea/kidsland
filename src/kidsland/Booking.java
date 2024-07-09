/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kidsland;

/**
 *
 * @author Cheas
 */
public class Booking {
    private int bookingId;
    private int customerId;
    private int rideId;
    private String bookingDate;
    private String rideDate;
    private double totalPrice;

    public Booking(int bookingId, int customerId, int rideId, String bookingDate, String rideDate, double totalPrice) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.rideId = rideId;
        this.bookingDate = bookingDate;
        this.rideDate = rideDate;
        this.totalPrice = totalPrice;
    }

    public double calculateTotalPrice(double price, double discountRate) {
        
        return price * (1 - discountRate);
    }

    public void createBooking() {
        
    }

   
}

