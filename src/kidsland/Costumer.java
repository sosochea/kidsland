/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kidsland;

/**
 *
 * @author Cheas
 */
public class Costumer {
    private int costumerId;
    private String name;
    private String email;
    private String password;
    private String customerType;

    public Costumer(int customerId, String name, String email, String password, String customerType) {
        this.costumerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.customerType = customerType;
    }

    public void register() {
        
    }

    public boolean login(String email, String password) {
       
        return true;
    }

    public void bookRide(int rideId, String rideDate) {
       
    }

    
}

