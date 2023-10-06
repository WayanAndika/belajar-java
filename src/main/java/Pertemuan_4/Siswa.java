/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4;

/**
 *
 * @author Wayan Andika
 */
public class Siswa {
    int umur;
    String nim;
    String nama;
    String jurusan;
    public Siswa(){
        this.umur=19;
        this.nama="Andika";
        this.nim="2201010001";
        this.jurusan="Sistem Sumber Daya";
    }
    public Siswa(int Umur, String Nama)
    {
        this.nama=Nama;
        this.umur=Umur;
    }
    
    public static void main(String[] args)
    {
        Siswa siswa=new Siswa();
        System.out.println("Nama Siswa Ganteng ini adalah "+siswa.nama);
        System.out.println("Dengan NIM-nya yaitu= "+siswa.nim);
        System.out.println("Dan dengan jurusan= "+siswa.jurusan);
        System.out.println("Dengan umur = "+siswa.umur);   
        
        System.out.println("=====================");
        Siswa siswa2=new Siswa(20,"Joko");
        System.out.println("Nama Siswa Ganteng ini adalah "+siswa2.nama);
        System.out.println("Dengan Umur-nya yaitu= "+siswa2.umur);
    }
}
