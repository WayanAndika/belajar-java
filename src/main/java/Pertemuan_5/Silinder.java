/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author Wayan Andika
 */
public class Silinder extends Lingkaran {
    public double tinggi;

    public Silinder(double radius, String warna, double tinggi) {
        super(radius, warna);
        this.tinggi=tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double t){
        this.tinggi=t;
    }
    public double hitungVolume(){
        return PHI*radius*radius*tinggi;
    }
    public void printInfo(){
        System.out.println("Silinder warna= "+warna+" volume = "+hitungVolume());
    }
    public static void main(String[] args){
        Silinder s=new Silinder(10,"Orange",5);
        s.printInfo();
        s.setTinggi(10);
        s.setRadius(20);
        s.setWarna("Hitam");
        s.printInfo();
    }
}
