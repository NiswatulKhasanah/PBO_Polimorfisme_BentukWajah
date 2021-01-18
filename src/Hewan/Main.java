/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author niswa
 */
public class Main {
    public static void main(String[] args) {
       Hewan hewan = new Hewan();
       Sapi sapi = new Sapi();
       Harimau harimau = new Harimau();
       Monyet monyet = new Monyet();
       
       
       hewan = sapi;
       hewan.berkaki();
       hewan = sapi;
       hewan.pemakan();
       hewan = sapi;
       hewan.bersuara();
     
       
       hewan = harimau;
       hewan.berkaki();
       hewan = harimau;
       hewan.pemakan();
       hewan = harimau;
       hewan.bersuara();
   
       
   
       
       
    }
   
}
