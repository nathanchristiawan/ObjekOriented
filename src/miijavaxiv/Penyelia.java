package miijavaxiv;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Penyelia extends Karyawan{

    public Penyelia() {      //constructor
        System.out.println("ctor Penyelia");
    }

    public Penyelia(String id, String nama, String alamat) {
        //super(id, nama, alamat);
        System.out.println("P1");
    }
    
    
    
    public int methodC(){
        
        
        return 0;
    }

    @Override
    public String getAlamat() {
        return "Jakarta"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); 
        builder.append("Nama : ");
        builder.append(nama);
        builder.append(", Alamat ");
        builder.append(alamat);
        builder.append(getAlamat());
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        Penyelia penyelia = new Penyelia();
        penyelia.setAlamat("Bandung");
        
        System.out.println(penyelia.getAlamat());
        
        Penyelia penyelia1 = new Penyelia();
        penyelia1.setAlamat("Jogjakarta");
        
        Karyawan penyelia2 = new Karyawan("WNA","Alucard","Bottom Line");
        System.out.println(penyelia2);
        System.out.println(penyelia);   //ketika memanggil objek, secara tidak langsung kita memanggil .toString();
        System.out.println(penyelia.hashCode());
        System.out.println(penyelia1.hashCode());
    }
    
}
