/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author Wayan Andika
 */
public class BujurSangkar extends Bentuk{
    public double sisi;
    public BujurSangkar(double sisi, String warna){
        this.sisi=sisi;
        this.warna=warna;
    }
    public double getSisi(){
        return this.sisi;
    }
    public void setSisi(double sisi){
        this.sisi=sisi;
    }
    public double hitungLuas(){
        return sisi*sisi;
    }
    public void printInfo(){
        System.out.println("Bujur Sangkar berwarna= "+ warna +", dengan luas= "+ hitungLuas());
    }
    public static void main(String[] args){
        BujurSangkar bj=new BujurSangkar(10,"Merah");
        bj.setSisi(20);
        bj.setWarna("Hijau");
        bj.hitungLuas();
        bj.printInfo();
    }
}
