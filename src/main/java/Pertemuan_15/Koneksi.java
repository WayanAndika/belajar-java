/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_15;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Koneksi {
    public static Connection Koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/pegawai","root","");
            System.out.println("yes");
            return koneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("gagal "+e.getMessage());
            return null;
        }
    }
}
