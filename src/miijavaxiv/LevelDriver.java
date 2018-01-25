/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author USER
 */
public class LevelDriver<T> {
    
    
    public void add(T t){
        
    }
    static void methodZ(int y,Level1 l){
        
    }
    
    static void methodZ(InterfaceX x){
        
    }
    
    public static void main(String[] args) {
       methodZ(new Level3());
        Level1 level11 = new Level2() {

            @Override
            void methoid2() {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            void method1(int y) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        level11.method1(0);
        
        System.out.println(level11.getClass());
        System.out.println(level11 instanceof Level1);  //instanceof digunakan untuk mengecek 
        System.out.println(level11 instanceof Level2);  //apakah var tsb adalah tipedata dr clas tersebut
        
        Dictionary dictionary = new Hashtable();
        dictionary.put("Indonesia","Jakarta");
        
        System.out.println(dictionary.size());
        
        InterfaceX x = new Level3();   //level 3 sudah di implements dengan InterfaceX
        
        List<String> jajal = new ArrayList<>();
        jajal.add("T");
        jajal.add("U");
        jajal.add("A");
        System.out.println(jajal);
        
        Map<String, String> jajalmap = new HashMap<String, String>();
        jajalmap.put("key","fck");
        System.out.println(jajalmap.get("key"));
        
        Map map = new HashMap();   //"TreeMap":output akan urut abjad, "HashMap":random dan lebih cepat
        map.put("Indonesia", "Jakarta");
        map.put("Singapore", "Singapore");
        map.put("Brunei", "Bandar seri begawan");
        
        map.forEach((k,v)-> System.out.println(k +" ==>"+ v));
        
        List list = new ArrayList();
        list.add("percobaan");
        list.add(70);
        list.forEach(t -> System.out.println(t));
    }
}
