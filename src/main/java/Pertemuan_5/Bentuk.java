/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author Wayan Andika
 */
public class Bentuk {
    public String warna;
    public Bentuk(){
        this.warna="Abu-Abu";
    }
    public void setWarna(String Warna){
        this.warna=Warna;
    }
    public String getWarna(){
        return this.warna;
    }
    public void printInfo(){
        System.out.println("Bentuk warna adalah "+this.warna);
    }
}
