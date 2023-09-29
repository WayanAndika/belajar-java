/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author Wayan Andika
 */
public class Balok {
    
    public static void main(String[] args)
    {
        int p=20;
        int l=12;
        int t=10;

        int volume=p*l*t;
        int luasPermukaan=2*((p*l)+(p*t)+(l*t));
        System.out.println("Volume = "+ volume);
        System.out.println("Luas Permukaan = "+luasPermukaan);
    }
}
