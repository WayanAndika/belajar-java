/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author Wayan Andika
 */
public class Lingkaran extends Bentuk{
    public double radius;
    public final double PHI = 3.14;
    public Lingkaran(double radius, String warna){
        this.radius=radius;
        this.warna=warna;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius=r;
    }
    public double hitungLuas(){
        return PHI*radius*radius;
    }
    public void printInfo(){
       System.out.println("Hasil Luas Lingkaran adalah= "+hitungLuas()+ ", dengan warna= "+getWarna());
    }
    public static void main(String[] args){
        Lingkaran l=new Lingkaran(10,"Merah");
        l.printInfo();
        l.setRadius(20);
        l.setWarna("Pink");
        l.printInfo();
    }
}
