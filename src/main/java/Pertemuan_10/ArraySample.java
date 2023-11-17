/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_10;

/**
 *
 * @author Lenovo
 */
public class ArraySample {
    public static void main(String[] args){
        int[] ages=new int[100];
        for(int i=0;i<100;i++){
            ages[i]=i;
            if(i%2==0 && i !=0){
                System.out.print(ages[i]+" ");
            }else{
                System.out.println(ages[i]);
            }
            
        }
    }
}
