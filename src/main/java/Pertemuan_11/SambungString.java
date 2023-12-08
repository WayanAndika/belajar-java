/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_11;

/**
 *
 * @author Lenovo
 */
public class SambungString {
   public static void main(String[] args) {
      String stringPertama = "Banyak ";
      String stringKedua = "tangan ";
      String stringKetiga = "membuat kerja ringan";
      String stringKu; // Variabel untuk menyimpan hasil

      // Menyambung tiga string dan menyimpan hasil
      stringKu = stringPertama + stringKedua + stringKetiga;
      System.out.println(stringKu);

      // Mengkonversi integer menjadi String dan menyambung dua string lain
      int bykTangan = 99;
      stringKu = bykTangan + " " + stringKedua + stringKetiga;
      System.out.println(stringKu);

      // Menyambung sebuah string dan integer-integer
      stringKu = "lima lima adalah "+ 5 + 5;
      System.out.println(stringKu);

      // Menyambung integer-integer dan sebuah string
      stringKu = 5 + 5 + " adalah sepuluh";
      System.out.println(stringKu);
   }
}
