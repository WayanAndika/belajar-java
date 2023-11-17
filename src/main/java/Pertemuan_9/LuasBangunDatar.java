/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9;

/**
 *
 * @author Lenovo
 */
public class LuasBangunDatar {
    public static void main(String[] args){
        // Inisiasi Objek dari Kelas Persegi Panjang
        PersegiPanjang pp=new PersegiPanjang(10,5);
        System.out.println("Luas Persegi Panjang= "+pp.hitungLuas()+ " dengan KLL= "+pp.hitungKLL());
        
        // Inisiasi Objek dari Kelas Segitiga
        Segitiga s=new Segitiga(5,10,12);
        System.out.println("Luas Segitiga = "+s.hitungLuas()+ " dengan KLL= "+s.hitungKLL());
    }
}
