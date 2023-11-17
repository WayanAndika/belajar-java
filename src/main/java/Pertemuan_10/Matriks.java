/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_10;

/**
 *
 * @author Lenovo
 */
public class Matriks {
    public static void main(String[] args){
    int [][] ages={{13,14},{15,16}};
    int [][] ages2={{13,14},{15,16}};
    for(int i=0;i<ages.length;i++){
        for(int j=0;j<ages[i].length;j++){
            System.out.print(ages[i][j]-ages2[i][j]+" ");
        }
        System.out.println("");
    }
    }
}
