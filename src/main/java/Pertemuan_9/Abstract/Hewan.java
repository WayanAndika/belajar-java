/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9.Abstract;

/**
 *
 * @author Lenovo
 */
public abstract class Hewan {
    protected String nama;
    protected int jumKaki;
    protected boolean bisaTerbang=false;
    public Hewan(String nama,int kaki, boolean terbang){
        this.nama=nama;
        jumKaki=kaki;
        bisaTerbang= terbang;
    }
    public abstract void bersuara();
    public static void makan(){
        System.out.println("nyam,nyam,nyam");
    }
    public void isHewan(){
        System.out.println("nama: "+nama);
        System.out.println("Jumlah Kaki: "+jumKaki);
        System.out.println("Bisa Terbang: "+bisaTerbang);   
    }
}
