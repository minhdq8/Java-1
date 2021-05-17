/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import java.util.Arrays;





/**
 *
 * @author Minh
 */
public class demo54Arrays {
    public static void main(String[] args) {
        
        int a[] = {9,3,8,7,3,9,4,2}; 
        //System.out.println("Mảng gốc : "+ Arrays.toString(a));
        for (int i : a) {
            System.out.print(i + " ");
        }
                    
        Arrays.sort(a);        
        System.out.println("Sau sort: " + Arrays.toString(a));
//        
//        int i = Arrays.binarySearch(a, 8);
//        System.out.println("Vị trí của 8 là : " + i);
//        
//        Arrays.fill(a, 0);
//        System.out.println("Sau fill :"+ Arrays.toString(a));
//    
    }
   
}
