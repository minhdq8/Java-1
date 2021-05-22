/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Ham_Function {
    static Scanner sc = new Scanner(System.in);
    static int a;
    public static void main(String[] args) {
        
        System.out.print("Mời nhập số 1: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập số 2: ");
        int soThu2 = Integer.parseInt(sc.nextLine());
//        tinhTong();
//        tinhTong(soThu2, soThu1);
//        tinhTong(10.2, 9);
    
        System.out.println(tinhHieu() * 2);
        System.out.println(tinhHieu(123.43,111.11));
    }

    // 1. ko có KDL trả về, ko có tham số truyền vào
    public static void tinhTong() {
        int a = 10, b = 20;
        System.out.println("Tổng" + (a + b));
    }
    // 2. ko có KDL trả về, có tham số truyền vào
    // thử tự của tham số truyền vào
    public static void tinhTong(int so1, int so2) {
        System.out.println(so1);
        System.out.println("Tổng: " + (so1 + so2));
    }// KDL của tham số = KDL của truyền vào

    public static void tinhTong(double a, int b) {
        System.out.println(a + b);
    }

    public static void tinhTong(double a, int b, int c) {
        System.out.println(a + b);
    }

    // 3. có KDL trả về, ko có tham số
    public static double tinhHieu() {
        a = 20;
        int b = 10;
        double c = 9.2;
        return (a - c);// trả về gtri của hàm
    }
    // 4. có KDL và có tham số
    public static double tinhHieu(double a, double b){
        return (a - b);
    }
}
