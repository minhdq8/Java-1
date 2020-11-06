/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide1;

import java.util.Scanner;


/**
 *
 * @author minhdq
 */
public class Demo1 {
    public static void main(String[] args) {
        // khai báo biến
        int a = 10, b = 8;
        double c = 9.2;
        String hoTen = "Tôi là Sơn Tùng MTP!";
        String hotTen1 ;
        // tính toán
        int tong = a + b;
        
        // khai báo và khởi tại 1 đối tượng để nhập từ bàn phím
        Scanner sc = new Scanner (System.in);
        System.out.print("Mời nhập thu nhập: ");
        c = sc.nextDouble();
        
        // xuất ra màn hình
        System.out.println("=====OUT PUT =====");
//        System.out.println(hoTen);
//        System.out.print(tong +" tuổi và "+ a + " năm đi hát \n");
        System.out.printf("Thu nhập là : %.0f tỷ/ tháng ", c);
        
        // hàm tính toán: Math
        System.out.print("\nSố bé hơn là: ");
        System.out.println(Math.min(a, b));
        Math.max(a, b);
       
     
        
    }
}
