/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

/**
 *
 * @author USER
 */
public class Owner extends Penyelia{

    public Owner() {
        System.out.println("Owner ganteng");
    }

    public Owner(String id, String nama, String alamat) {
        //super(id, nama, alamat);
        System.out.println("Owner baru");
    }
    
    
    
    
    public static void main(String[] args) {
        Owner owner = new Owner();
        
        System.out.println(owner);
    }
    
}
