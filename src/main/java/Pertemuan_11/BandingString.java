/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_11;

/**
 *
 * @author Lenovo
 */
public class BandingString {
    public static void main(String[] args) {
      String string1 = "Terlalu banyak ";
      String string2 = "pendapat";
      String string3 = "Terlalu banyak pendapat";

      // Membuat string1 dan string3 mereferensi ke string berbeda
      // yang identik
      string1 += string2;

      // Menampilkan isi dari string-string
      System.out.println("Uji 1");
      System.out.println("string3 sekarang adalah: " + string3);
      System.out.println("string1 sekarang adalah: " + string1);

      if(string1 == string3) // Sekarang uji identitas
         System.out.println("string1 == string3 bernilai true." +
            " string1 dan string3 menunjuk ke string sama");
      else
         System.out.println("string1 == string3 bernilai false." +
            " string1 dan string3 tidak menunjuk ke string sama");

      // Sekarang buat string1 dan string2 mereferensi ke string sama
      string3 = string1;

      // Menampilkan isi dari string-string
      System.out.println("\n\nUji 2");
      System.out.println("string3 sekarang adalah: " + string3);
      System.out.println("string1 sekarang adalah: " + string1);
     
      if(string1 == string3) // Sekarang uji identitas
         System.out.println("string1 == string3 bernilai true." +
            " string1 dan string3 menunjuk ke string sama");
      else
         System.out.println("string1 == string3 bernilai false." +
            " string1 dan string3 tidak menunjuk ke string sama");
   }

}
