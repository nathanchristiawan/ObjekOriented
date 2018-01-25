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
public class ScopeVariable {
    int z;
    static int y;
    
    public void methodA(int z){
        this.z = 29;
        y = 14;
        methodC();   //masih bisa memanggil method level class/static
    }
    
    public static void methodC(){   //static method hanya bisa memanggil atribut dan properties yang bersifat STATIC juga
        y = 20;  
    }
    
    static void methodD(){   //hanya bisa memanggil method level class
        methodC();   
    }
    
    public void methodB(){
         int z = 20;
         this.z = z;
    }
}
