/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kidsland;

/**
 *
 * @author Cheas
 */
public class Employee {
    private int employeeId;
    private String name;
    private String email;
    private String password;
    private String role;

    public Employee(int employeeId, String name, String email, String password, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public boolean login(String email, String password) {
        
        return true;
    }

    public void addRide(Ride ride) {
       
    }

    public void updateRide(Ride ride) {
        
    }

   

}

