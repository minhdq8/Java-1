/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt16101_ud;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // toán tử 3 ngôi
        int a = 9, b = 11, c = 2;
        int max1 = a > b ? a : b;
        int max = max1 > c ? max1 : c;
        System.out.println("SLN:  " + max);
        
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập thông tin     
        System.out.print("Nhập tên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập số đo vòng 3:");
        double vongBa = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập dáng: ");
        String dangNguoi = sc.nextLine();

        System.out.print("Nhập chiều cao: ");
        double chieuCao = Double.parseDouble(sc.nextLine());
        // xuất thông tin
        System.out.printf("Tên là %s nhớ người yêu cũ dáng %s "
                + "có vòng 3 là %.2f với chiều cao %.2f\n ",
                 hoTen, dangNguoi, vongBa, chieuCao);

    }
}
