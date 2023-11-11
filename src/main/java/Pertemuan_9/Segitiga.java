/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9;

/**
 *
 * @author Lenovo
 */
public class Segitiga implements BangunDatar {
    private int a,t,miring;
    public Segitiga(int a, int t,int m){
        this.a=a;
        this.t=t;
        this.miring=m;
    }
    public double hitungLuas(){
        return 0.5*a*t;
    }
    public double hitungKLL(){
        return a+t+miring;
    }
}
