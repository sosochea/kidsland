/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kidsland;

/**
 *
 * @author Cheas
 */
public class Discount {
    private int discountId;
    private String customerType;
    private double discountRate;

    public Discount(int discountId, String customerType, double discountRate) {
        this.discountId = discountId;
        this.customerType = customerType;
        this.discountRate = discountRate;
    }

    public double applyDiscount(double price) {
        return price * (1 - discountRate);
    }

    
}
