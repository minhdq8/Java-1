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
    // biến toàn cục
    static Scanner sc = new Scanner (System.in);
//    static int a, b;
    public static void main(String[] args) {
        
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
//        int b = sc.nextInt();
        double b = sc.nextDouble();
        
        int c = tinhTong();
        System.out.println(c);
        System.out.println(tinhTong());
//        tinhTong(a,"chuối");
//        tinhHieu(a,a);
        
    }
    /*
        Tham số truyền vào
            1. kiểu dữ liệu phù hợp
            2. thứ tự tham số truyền vào
        KDL trả về :
            1. ngoài void thì bắt buộc phải có return
            2. return ra giá trị của hàm
            3. trả về đúng KDL
    
        
    */
//        1. ko có KDL ko có tham số
    public static void chanDoi(){
        
    }   
//        2.có KDL , ko tham số
    public static int chanBoDoi(){
        return 0;
    }
//        3. có KDL , có tham số
    public static String chanNguoiYeu(String ten){
        return "";
    }
//        4. ko có KDL, có tham số
    public static void chanNYC(String diCapBo){
        
        
        
        
        
    }
    public static int tinhTong(){
        // 
        int a = 10;
        return a;
    }
    public static String tinhTong(String name){
        //
        return "";
    }
    public static void tinhTong(int a, String b){
//        int a = 10, b = 20;// biến cục bộ
        System.out.println((a+b));
    }
    public static void tinhHieu(int a, int b){
//        int a = 10, b = 20;
       System.out.println((a-b));
    }
}
