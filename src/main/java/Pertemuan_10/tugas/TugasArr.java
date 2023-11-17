/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_10.tugas;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class TugasArr {
    public static void main(String[] args){
        int[] arr={23,6,47,35,2,14};
        // Sorting Array Soal No.1
        Arrays.sort(arr);
        System.out.println("Ini Mengurutkan Array");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
        // Tampilkan Bilangan Ganjil
        System.out.println("Ini Bilangan Ganjil");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        // Tampilkan Bilangan Genap
        System.out.println("");
        System.out.println("Ini Bilangan Genap");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
