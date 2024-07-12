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
public class PanierPrincipal {
    public int PanierPrincipalid;
    public int Peopleid;
    public Date dateCreation;

    public PanierPrincipal(int PanierPrincipalid, int Peopleid, Date dateCreation) {
        this.PanierPrincipalid = PanierPrincipalid;
        this.Peopleid = Peopleid;
        this.dateCreation = dateCreation;
    }
}
