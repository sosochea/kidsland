package kidsland;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class PanierItem {
    public int PanierItemid;
    public int PanierPrincipalid;
    public int rideId;
    public Date date;

    public PanierItem(int PanierItemid, int PanierPrincipalid, int idRide, Date date) {
        this.PanierItemid = PanierItemid;
        this.PanierPrincipalid = PanierPrincipalid;
        this.rideId = rideId;
        this.date = date;
    }
}
