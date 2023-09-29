/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author Wayan Andika
 */
public class Aritmatika {
    static void checkGanjilGenap(int x)
    {
        if(x%2==0){
            System.out.println(x+" merupakan Bilangan Genap");
        }else if(x%2==1){
            System.out.println(x+" merupakan Bilangan Ganjil");
        }else{
            System.out.println("Yang Anda Masukan Bukan Angka");
        }
    }
    
    // main method
    public static void main(String[] args)
    {
        checkGanjilGenap(2);
        checkGanjilGenap(1);
    }
}
