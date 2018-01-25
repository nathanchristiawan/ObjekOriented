package miijavaxiv;


import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Percabangan {
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Bulan apa coy??");
//int bulan = scanner.nextInt();
        Bulan bulan=Bulan.valueOf(scanner.next());
            System.out.println("Tahunnya juga dong!!!");
        int jmlhari = 0;
        int tahun = scanner.nextInt();
        
        switch(bulan){
            case FEBRUARI:
                jmlhari=tahun % 4 == 0 ? 29 : 28
                        ;
                break;
            case APRIL:
            case JUNI:
            case SEPTEMBER:
            case NOVEMBER:
                jmlhari=30;
                break;
            case JANUARI:
            case MARET:
            case MEI:
            case JULI:
            case AGUSTUS:
            case OKTOBER:
            case DESEMBER:
                jmlhari=31;
                break;
            default:
                System.out.println("data tidak ada");
                
                    
        }
            System.out.println("Jumlah hari = "+ jmlhari);
        }
    }

}
enum Bulan{
    JANUARI,FEBRUARI,MARET,APRIL,MEI,JUNI,JULI,AGUSTUS,SEPTEMBER,OKTOBER,NOVEMBER,DESEMBER;
}