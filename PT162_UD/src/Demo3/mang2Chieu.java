/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class mang2Chieu {
        public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
       nhapXuat();
    }
     static void nhapXuat(){
         // size
         System.out.print("Nhập số hàng : ");
         int hang = sc.nextInt();
         System.out.print("Nhập số cột : ");
         int cot = sc.nextInt();
         // kbao va ktao
         int a [][] = new int[hang][cot];
         // nhap ptu
         System.out.println("Nhập phần tử :");
            for(int i = 0; i < hang; i++){
                for(int j = 0; j < cot ; j++){
                    System.out.printf("a[%d][%d] = " , i,j);
                    a[i][j] = sc.nextInt();
                }
            }
         // xuat
         System.out.println("Mảng vừa nhập là : ");
         for(int i = 0; i<hang; i++){
             for(int j = 0; j< cot; j++){
                 System.out.print("\t"+ a[i][j]);
             }
             System.out.println("");
         }
    
    }
}
