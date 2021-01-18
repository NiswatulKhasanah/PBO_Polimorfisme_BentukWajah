/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungGajiPegawai;

/**
 *
 * @author niswa
 */
public class JumlahGaji extends Gaji{
    double all;
    
    public void gaji(){
        JumlahGaji jumlahgaji = new JumlahGaji();
        jumlahgaji.g_pokok(2000000);
        jumlahgaji.t(4200000);
        jumlahgaji.t1(3500000);
        jumlahgaji.t2(2700000);
        jumlahgaji.t3(1800000);
        
        System.out.println("Gaji Pokok \t : Rp. "+jumlahgaji.gGP() +",-");
        System.out.println("Gaji Tunjangan 1 \t : Rp. "+jumlahgaji.gT1()  +",-");
        System.out.println("Gaji Tunjangan 2 \t: Rp. "+jumlahgaji.gT2() +",-");
        System.out.println("Gaji Tunjangan 3 \t : Rp. "+jumlahgaji.gT3() +",-");
        System.out.println("Gaji Tunjangan 4 \t : Rp. "+jumlahgaji.gT() +",-");  
        
        all = (double) jumlahgaji.gGP()  + jumlahgaji.gT1() + jumlahgaji.gT2() + jumlahgaji.gT3() + jumlahgaji.gT(); 
    }
    
    public double all(){
        return all;
    }
}
