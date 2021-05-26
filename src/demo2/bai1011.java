/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author minhdq
 */
public class bai1011 {

    public static void main(String[] args) {
        double a = 10, b = 21, c = 12;
        // tên + giá trị
        String show = ((a + b) > c) && ((a + c) > b) && ((b + c) > a) ? "3 cạnh" : "ko phải";
        System.out.println(show);

        System.out.println(tinhHieu(a, b));
        System.out.println(tinhTich(a, b));
        System.out.println(tinhTong(tinhHieu(a, b), tinhTich(a, b)));
        
    }

    public static double tinhHieu(double v1, double v3) {
        return (v1 - v3);
    }

    public static double tinhTich(double v1, double v3) {
        return (v1 * v3);
    }
    public static double tinhTong(double v1, double v3) {
        return (v1 + v3);
    }
    public static double tinhBinhPhuong(double a) {
        return a*2;
    }
}
