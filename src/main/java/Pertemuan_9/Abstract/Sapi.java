/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9.Abstract;

/**
 *
 * @author Lenovo
 */
public class Sapi extends Hewan{
    public Sapi(){
        super("sapi",4,false);
    }
    public void bersuara(){
        System.out.println("\nemoh..,emoh....");
    }
    public static void main(String[] args){
        Sapi s=new Sapi();
        s.isHewan();
        s.bersuara();
    }
}
