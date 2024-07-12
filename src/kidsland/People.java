package kidsland;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class People {
    public int Peopleid;
    public String nom;
    public String mail;
    public String motDePasse;
    public int anneeNaissance;
    public String role; // "customer" ou "employee"
    public double discount;
    public byte[] photo;

    public People(int Peopleid, String nom, String mail, String motDePasse, int anneeNaissance, String role, double discount, byte[] photo) {
        this.Peopleid = Peopleid;
        this.nom = nom;
        this.mail = mail;
        this.motDePasse = motDePasse;
        this.anneeNaissance = anneeNaissance;
        this.role = role;
        this.discount = discount;
        this.photo = photo;
    }

}

