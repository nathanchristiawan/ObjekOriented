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
public class FinalKeyword {     //FINALCLASS adalah class yg tidak bisa di Extends dan di overide lagi
                                //untuk mengisi nilai tipe data "final", bisa di lakukan saat initialisasi atau buat constructor, dan pilih salah satu saja
    final int x;
    
    public FinalKeyword(){
        x = 20;
    }
    
    public FinalKeyword(int x){
        this.x=20;
    }
    
    final void methodFinal(){
        
    }
    
}
