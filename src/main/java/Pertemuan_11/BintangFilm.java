/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_11;

/**
 *
 * @author Lenovo
 */
public class BintangFilm {
   public static void main(String[] args) {
      String[] bintang = {"Robert Redford" , "Marilyn Monroe",
                        "Boris Karloff" , "Lassie",
                        "Hopalong Cassidy", "Trigger"};
                        
      System.out.println("Bintang film Anda hari ini adalah "
         + bintang[(int)(bintang.length*Math.random())]);
   }
}

