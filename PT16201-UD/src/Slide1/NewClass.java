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
public class NewClass {
    public static void main(String[] args) {
            /*Thông tin người yêu cũ
	Nhập tên:
	Nhập số đo vòng 3:
	Nhập dáng: 
	Nhập chiều cao: 
            */
            Scanner sc = new Scanner (System.in);
            // nhập
            System.out.println("Nhập thông tin NYC");
            System.out.print("Nhập tên: ");
            String hoTen = sc.nextLine();
            
            System.out.print("Nhập số đo: ");
            double soDo = Double.parseDouble(sc.nextLine());
//            double soDo1 = sc.nextDouble();
//            sc.nextLine();
            System.out.print("Nhập dáng: ");
            String dangNguoi = sc.nextLine();
            
            System.out.print("Nhập chiều cao: ");
            double chieuCao = sc.nextDouble();
            // xuất
            
            
            
            
    }
    public static void main01(String[] args) {
        // khai báo ...
//        int a = 10, b = 100;
//        String hoTen = "java core";
//        String hoTen1 = "";
//        // xuất ra màn hình
//        System.out.print("In ra a là : " + a);
//        System.out.println(b);
//        System.out.printf("%d", b);
//        System.out.printf("%s\n", hoTen);
        // nhập vào giá trị
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Mời nhập tuổi bạn: ");
        int tuoi = sc.nextInt();
        System.out.print("Mời nhập tuổi ngY bạn: ");
        int tuoiNY = sc.nextInt();
        
        int tuoiTho = tuoi + tuoiNY;
        
        System.out.printf("Tuổi thọ là: %d\n", (tuoi + tuoiNY) );
        
    }
}
