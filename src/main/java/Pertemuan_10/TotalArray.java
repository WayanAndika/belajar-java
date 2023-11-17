/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_10;

/**
 *
 * @author Lenovo
 */
public class TotalArray {
    public static void main(String[] args){
        int[] ages=new int[100];
        int a=0;
        for(int i=0;i<100;i++){
            if(i%2==1){
               ages[i]=i; 
               a+=ages[i];
            }
        }
        System.out.println(a);
    }
}
