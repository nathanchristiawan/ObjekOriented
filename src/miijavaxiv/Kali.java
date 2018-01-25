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
public class Kali {

    
     public double kalipositif(int a, int b){
       
         double jml = 0;
         if ((a > 0) && (b > 0)){
                for (int i=1; i<=b; i++ ){
                    jml=jml+a;}
                   System.out.println("Hasil kali = "+jml);
         
         }
         return a*b;
         
     }
    
     public double kalinegatif(int a, int b){
         double jml=0;
         if((a<0)&&(b<0)){
                for (int i=1; i<=(-b); i++ ){
                    jml=jml+(-a);}
                    System.out.println("Hasil kali = "+jml);
            
            }else if ((a>0)&&(b<0)){
                    for (int i=1; i<=(-b); i++ ){
                    jml=jml+a;}
                    System.out.println("Hasil kali = "+-jml);
            }else { 
                    for (int i=1; i<=b; i++ ){
                    jml=jml+a;}
                    System.out.println("Hasil kali = "+jml);}
         return a*b;
     }
     
     public double kalinol(int a,int b){
         double jml=0;
         
         return a*b;
     }
}

