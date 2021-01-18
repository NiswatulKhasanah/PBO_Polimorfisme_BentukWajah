/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kendaraan;

/**
 *
 * @author niswa
 */
public class Main {
    public static void main(String[] args) {
        kendaraan Kendaraan[] = new kendaraan[3];
int posisi = 10;
Kendaraan[0] = new motor(posisi);
Kendaraan[1] = new mobil(posisi);
Kendaraan[2] = new pesawat(posisi);
if (Kendaraan[0] instanceof motor) {
System.out.println("Kendaraan[0] merupakan instanceof motor");
}
if (Kendaraan[1] instanceof mobil) {
System.out.println("Kendaraan[1] merupakan instanceof mobil");
}
if (Kendaraan[2] instanceof pesawat) {
System.out.println("Kendaraan[2] merupakan instanceof peswat");
}
}
    }
    

