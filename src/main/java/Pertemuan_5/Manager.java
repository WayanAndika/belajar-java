/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author Wayan Andika
 */
public class Manager extends Pegawai {
    //public String departemen;
    public static void main(String[] args){
        Manager Bawa=new Manager();
        Bawa.nama="Gede Bawa";
        Bawa.alamat="Jln Denpasar";
        Bawa.jenis_kelamin="Laki-Laki";
        Bawa.setGaji(5000000);
        Bawa.setPerusahaan("Unilever");
        System.out.println("Nama Perusahaan ini adalah "+ Bawa.getPerusahaan());
        System.out.println("Nama Manager ini adalah "+ Bawa.nama);
        System.out.println("Alamat Manager ini adalah "+ Bawa.alamat);
        System.out.println("Jenis Kelamin Manager ini adalah "+ Bawa.jenis_kelamin);
        System.out.println("Gaji Manager ini adalah "+ String.format("%.2f", Bawa.getGaji()) );
    }
}
