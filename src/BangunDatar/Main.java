/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author niswa
 */
public class Main {

    public static void main(String[] args) {
 
      cetakObyek(new Balok());
      cetakObyek(new PersegiPanjang());
      cetakObyek(new BangunDatar());
      cetakObyek(new Object());
   }
    
   public static void cetakObyek(Object obyek) {
      System.out.println(obyek);
   }
    }
    

