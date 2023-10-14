/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author Wayan Andika
 */
public class Pegawai {
    public String nama;
    public String perusahaan;
    public String alamat;
    public String jenis_kelamin;
    public int umur;
    private double gaji;
    private String telp;
    public String getNama(){
        return nama;
    }
    public void setGaji(double Gaji){
        this.gaji=Gaji;
    }
    public double getGaji(){
        return gaji;
    }
    public void setPerusahaan(String perusahaan){
        this.perusahaan=perusahaan;
    }
    public String getPerusahaan(){
        return perusahaan;
    }
    public static void main(String[] args){
        System.out.println("Halo");
    }
}
