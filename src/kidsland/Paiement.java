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
public class Paiement {
    private int Paiementid;
    public int PanierPrincipalid;
    public double prixFinal;
    public String numeroDeCarte;
    public Date dateExpiration;
    public String cvv;

    public Paiement(int Paiementid, int PanierPrincipalid, double prixFinal, String numeroDeCarte, Date dateExpiration, String cvv) {
        this.Paiementid = Paiementid;
        this.PanierPrincipalid = PanierPrincipalid;
        this.prixFinal = prixFinal;
        this.numeroDeCarte = numeroDeCarte;
        this.dateExpiration = dateExpiration;
        this.cvv = cvv;
    }
}
