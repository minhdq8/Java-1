/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

/**
 *
 * @author Minh
 */
public class demo53CopyMang {
    public static void main(String[] args) {
                
//        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 
//                'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
//        char[] copyTo = new char[7];
// 
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        System.out.println(new String(copyTo));

        int a[] = {1,2,3,4,5,6};
        int b[] = new int[5];
        System.arraycopy(a, 0, b, 0, 3);
         for(int i = 0; i < b.length ; i++){
            System.out.print(b[i]);
        }
         System.out.println("");
        System.arraycopy(a, 4, b, 3, 2);
        for(int i = 0; i < b.length ; i++){
            System.out.print(b[i]);
        }  //  
        
    }
}
