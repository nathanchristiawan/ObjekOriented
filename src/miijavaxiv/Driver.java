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
public class Driver {
    public static void main(String[] args) {
        int hari=21;
        Karyawan karyawan=new Karyawan();
        karyawan.setId("WNI");
        karyawan.setNama("Nathan");
        karyawan.setAlamat("Jogja");
        //System.out.println(Math.floor(40+Math.random()*60));
        hari=karyawan.mengajukancuti(hari);
        System.out.println(hari);
        karyawan.mengajukancuti(karyawan);
        System.out.println(karyawan.getId());
        
        Karyawan k1 = new Karyawan();
        k1.jumlah=50;
        Karyawan k3 = new Karyawan();
        Karyawan k2 = k1;
        k2.setNama("Nanat");
        //System.out.println(k1.getNama);
        System.out.println(k3.jumlah);
        Karyawan.jumlah=100;
        System.out.println(k1.jumlah);
    }
}
