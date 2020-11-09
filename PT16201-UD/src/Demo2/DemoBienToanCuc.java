/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class DemoBienToanCuc {
    // biến toàn cục
    static Scanner sc = new Scanner (System.in);
    static int a, b;
    public static void main(String[] args) {
        
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        tinhTong();
        tinhHieu();
        
    }
    public static void tinhTong(){
//        int a = 10, b = 20;// biến cục bộ
        System.out.println((a+b));
    }
    public static void tinhHieu(){
//        int a = 10, b = 20;
       System.out.println((a-b));
    }
}
