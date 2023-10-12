/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;
import java.text.DecimalFormat;

/**
 *
 * @author Tita
 */

public final class mobil {
    private final String namaservice;
    private final String merkmobil;
    private double harga;
    
    public mobil(String namaservice, String merkmobil, double harga) {
        this.namaservice = namaservice;
        this.merkmobil = merkmobil;
        this.harga = harga;
    }
    
    public String getNamaService() {
        return namaservice;
    }
    
    public String getMerkMobil() {
        return merkmobil;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedHarga = decimalFormat.format(harga);
        
        return "Nama Service : " + namaservice + " | " + "Merk Mobil : " + merkmobil + " | " + "Harga : Rp " + formattedHarga;
    }
    
    public void setHarga (double harga) {
        this.harga = harga;
    }
    
    
}
