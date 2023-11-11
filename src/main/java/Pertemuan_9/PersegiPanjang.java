/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang implements BangunDatar{
    public double p;
    public double l;
    public PersegiPanjang(double p,double l){
        this.p=p;
        this.l=l;
    }
    public double hitungLuas(){
        return p*l;
    }
    public double hitungKLL(){
        return 2*(p+l);
    }
}
