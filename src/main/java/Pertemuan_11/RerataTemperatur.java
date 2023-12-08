/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_11;

/**
 *
 * @author Lenovo
 */
public class RerataTemperatur {
      public static void main(String[] args) {
      float[][] temperatur = new float[10][365]; // Array temperatur

      // Membangkitkan temperatur-temperatur acak
      for(int i = 0; i<temperatur.length; i++) {
         for(int j = 0; j < temperatur[i].length; j++) {
            temperatur[i][j] = (float)(45.0*Math.random() - 10.0);
         }
      }

      // Menghitung rerata per lokasi pengukuran
      for(int i = 0; i<temperatur.length; i++) {
         float rerata = 0.0f; // Tempat menyimpan rerata
            for(int j = 0; j < temperatur[i].length; j++) {
               rerata += temperatur[i][j];
            }

         // Menampilkan rerata temperatur untuk lokasi terkini
         System.out.println("Rerata temperatur pada lokasi "
            + (i+1) + " = " + rerata/(float)temperatur[i].length);
      }
   }
}
