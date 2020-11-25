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
public class Demo2 {

    // switch case
    public static void main(String[] args) {
        double a = 5, b = 7, c = -1;
        Scanner sc = new Scanner(System.in);

        int luaChon;
        System.out.print("Nhập: ");
        luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngày ăn chay");
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                System.out.println("30 ngày ăn cơm");
                break;
            case 2: 
                System.out.println("Đặc biệt trượt lô đề 29 ngày");
                break;
            default:
                System.out.println("Nhập sai rồi");
                break;

        }

    }

    // toán tử 3 ngôi
    public static void main01(String[] args) {
        // khai báo
        int a = 10, c = 4, b = 12;

//        String chuoi = (a > c) ? "a > c" : "c > a";
        int max1 = (a > c) ? a : c;
        int max = (max1 > b) ? max1 : b;

        System.out.println(" " + max);
    }
}
