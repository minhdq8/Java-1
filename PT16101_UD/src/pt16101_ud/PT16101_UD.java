/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt16101_ud;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class PT16101_UD {

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi;
        int tuoiNY;
        int tuoiTho;
        
        System.out.print("Mời nhập tuổi bạn: ");
        tuoi = sc.nextInt();
        System.out.print("Mời nhập tuổi NY: ");
        tuoiNY = sc.nextInt();
        tuoiTho = tuoi + tuoiNY;
        System.out.println("Tuổi thọ thánh là: " + tuoiTho + " hô hô");
        System.out.printf("Tuổi thọ thánh là: %d hô hô \n", tuoiTho);

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String hoTen; 
         int tuoi;
         String ngheNghiep;
         // nhập thông tin
         System.out.print("Nhập tên: ");
         hoTen = sc.nextLine();
         System.out.print("Nhập tuổi: ");
         tuoi = Integer.parseInt(sc.nextLine());
//         sc.nextLine();
         System.out.print("Nhập nghề: ");
         ngheNghiep = sc.nextLine();
         // xuất ra
         System.out.println("Tên là: "+ hoTen);
         System.out.println("Tuổi là: " + tuoi);
         System.out.println("Nghề là: "+ ngheNghiep);
         System.out.println("-----------");
         System.out.printf("Tên là : %s \nNăm nay %d tuổi\nNghề là : %s\n"
                 ,hoTen,tuoi,ngheNghiep
         );
    }

}
