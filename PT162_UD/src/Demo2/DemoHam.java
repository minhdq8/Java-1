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
public class DemoHam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
//        int b = sc.nextInt();
        double b = sc.nextDouble();
        // cách gọi hàm
//        tinhHieu(a,a);
//        tinhTong(a,b);
        System.out.println(tinhTong());
        String name = hoTen();
        System.out.println(name);
    }

    // sử dụng hàm
    /*
        Tham số truyền vào (có thể có or not)
            1. Lưu ý thứ tự tham số truyền vào
            2. KDL phù hợp
        KDL trả về:
            1. hàm trừ void, còn lại phải có return 
            2. return ra giá trị của hàm
            3. return lại đúng KDL của hàm
    */
    //1 ko KDL trả về và ko tham số
    public static void nhapTen(){
    }
    //2 có KDL trả về và ko có tham số
    public static String nhapTen1(){
        return "";
    } 
    //3 có KDL trả về có tham số 
    public static String nhapTen(String hoTen){
        return "";
    }
    //4 ko KDL và có tham số truyền vào
    public static void nhapTen(String hoTen, int a){
    }
    
    
    
    public static String hoTen(){
        return "Tôi là tiền tiêu";
    }
    public static int tinhTong(){
        int a = 10, b = 10;
        
        return a + b;
    }
    public static void tinhTong(int a, double b) {
        System.out.println((a + b));
    }
    public static void tinhTong(int a, double b, int c) {
        System.out.println((a + b + c));

    }

    public static void tinhHieu(int a, int b) {
        System.out.println((a - b));

    }

}
