/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4;

/**
 *
 * @author Wayan Andika
 */
public class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;
    public void setAlas(int a){
        if (a > 0){
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }
    public void setTinggi(int t){
        if (t > 0){
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }
    public double getLuas(){
        // hitung luasnya
        this.luas = (this.alas * this.tinggi)/2;
        System.out.println("Luas Segitiga= "+ this.luas);
        return 1;
    }
    public static void main(String args[]){
        Segitiga segitiga=new Segitiga();
        segitiga.alas=10;
        segitiga.tinggi=20;
        segitiga.getLuas();
    }
}
