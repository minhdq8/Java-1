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
public class Function {

    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
//        tinhTong();
//        System.out.println(tinhTong2());

        System.out.print("Mời nhập a: ");
        int a = Integer.parseInt(_sc.nextLine());
        System.out.print("Mời nhập b: ");
        int b = Integer.parseInt(_sc.nextLine());

        tinhTong(a, b);
        int _tuoi = 31;
        double _canNang = 69.96;
        tong2So(_tuoi, _canNang);

        System.out.println("Hiệu: " + tinhHieu(a, b));
    }

    // có tham số, có KDL trả về
    public static int tinhHieu(int a, int b) {
        return (a - b);
    }

    // có tham số truyền vào, ko có KDL trả về
    // thứ tự truyền vào của tham số
    // KDL truyền vào = KDL của tham số
    public static void tinhTong(int so1, int so2) {
        System.out.println("Tổng a + b = " + (so1 + so2));
    }
    public static void tong2So(int so1, double so2) {
        System.out.println("Tổng a + b = " + (so1 + so2));
    }

    // Ko có KDL trả về, Ko tham số
    public static void tinhTong() {
        int a = 10, b = 11;
        System.out.println("Tổng a + b = " + (a + b));
    }

    // có KDL trả về, ko tham số
    public static double tinhTong2() {
        double a = 10.5, b = 11;
        return a + b;// trả về giá trị của hàm
    }

}
