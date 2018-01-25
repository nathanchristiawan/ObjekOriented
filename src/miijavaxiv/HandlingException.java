/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class HandlingException {
    static void bacaFile(String namaFile) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(namaFile);
//            System.out.print((char)reader.read());
//            System.out.print((char)reader.read());
//            System.out.print((char)reader.read());
//            System.out.println((char)reader.read());
            int i;
            while( (i = reader.read()) > 0){
                System.out.print((char)i);
            }
    }
    public static void main(String[] args) {
        try {
            int c = 0;
            assert c > 0;       //semecam CEK POINT untuk mengecek kebenaran data/nilai
            if (c == 0) throw new CustomException("c tidak boleh 0");
            int y = 10 / c;
            bacaFile(args[0]);
//        try {
//
//            
//        } catch (FileNotFoundException ex) {
//            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
//              System.out.println(ex.getMessage());
//              ex.printStackTrace();
//        } catch (IOException ex) {
//            Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
//        }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        } catch (Error er){
            System.out.println(er.getMessage());
        }
    }
 
}
