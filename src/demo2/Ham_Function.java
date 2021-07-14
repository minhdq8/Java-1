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
 * 1. Tham số truyền vào
 * 2. Kiểu dữ liệu trả về
 * 3. Biến toàn cục, cục bộ
 * 4. Nạp chồng hàm (cùng tên but khác nhau về tham số truyền vào)
 * 
 */
public class Ham_Function {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int soThu2;
    public static void main(String[] args) {
        
        System.out.print("Mời nhập số 1: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập số 2: ");
        int soThu2 = Integer.parseInt(sc.nextLine());
//        tinhTong();
//        tinhTong(a, 20);
//                //10    10
//        tinhTong(10.1, (int)9.9);
    
        System.out.println(tinhHieu() * 2);
        tinhTong(tinhHieu(), a);
//        System.out.println(tinhHieu(123.43,111.11));
    }
    
    public static void xuatTT(){
        System.out.println("in 2 giá trị vừa nhập");
        System.out.println(a);
        System.out.println(soThu2);
    }
    
    // 1. ko có KDL trả về, ko có tham số truyền vào
    public static void tinhTong() {
        int a = 10, b = 20;
        System.out.println("Tổng" + (a + b));
    }
    // 2. ko có KDL trả về, có tham số truyền vào
    // thứ tự của tham số truyền vào
                                // 10       10
    public static void tinhTong(int so1, int so2) {
        System.out.println(so1);//10
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
    public static String showTen(){
        return "Chuổi tên Minh mắt mờ vì xem bóng :D ";
    }
}
