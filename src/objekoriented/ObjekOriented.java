/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objekoriented;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class ObjekOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1_000_000;
        //int o=10;
        long l=(long) i;
        double d1=5.6;
        double d2=5.8;
        char c=69;
        String e="e";
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Float.MAX_VALUE);
        //System.out.println(Double.MAX_VALUE);
        //System.out.println(c);
        //for (int o=0 ; o<=50; o++){
         //   System.out.println(o);
        
       // }
        //for (int p=0; p<10; p++){
          //  if (p%2 == 0)continue;
            //System.out.println(p);
                
    //}
        //for (int q=0; q<10; q++){
        //if (q%5 == 4)break;
      //  System.out.println(q);           
    //}
        
        
        int[] arrint[]={
            {1,2,3},
            {4,5,6}
        };
        System.out.println(arrint.length);
        for (int[] arrint1 : arrint) {
            for (int b : arrint1) {
                //System.out.println(b);
            }
        }
        
//        int[][] z=new int[5][];
//        for(int m=0; m<5; m++){
//         z[m]=new int[5];
//            for(int n=0; n<5; n++){
//              z[m][n]=(m*5)+(n+1);
//          } 
//            System.out.println(Arrays.toString(z[m]));   
//        }
        int[][] z=new int[5][];
        for(int m=0; m<5; m++){
         z[m]=new int[5];
            for(int n=0; n<5; n++){
              z[m][n]=(m+n)%2;
          } 
            System.out.println(Arrays.toString(z[m]));   
        }
}

}