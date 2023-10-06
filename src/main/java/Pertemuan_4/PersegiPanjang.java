/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4;

/**
 *
 * @author Wayan Andika
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    private double luas;
    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }
    public void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }
    public double getLuas(){
        this.luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
        return 1;
    }
    public static void main(String[] args){
        PersegiPanjang pp=new PersegiPanjang();
        pp.panjang=10;
        pp.lebar=5;
        pp.getLuas();
    }
}
