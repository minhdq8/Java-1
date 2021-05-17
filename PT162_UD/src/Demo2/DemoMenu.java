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
public class DemoMenu {

    // khai báo biến toàn cục
    static Scanner sc = new Scanner(System.in);
    static int a, b;

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("0. Siêu thoát");
        int luaChon;
        System.out.print("Nhập lựa chọn: ");
        luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                tinhTong();
                break;
            case 2:
                tinhHieu();
                break;
            case 3:
                break;
            case 99:
                System.exit(0);
            default:
                System.out.println("Nhập sai rồi");
                break;
        }
    }

    public static int tinhTong() {
        return a+b;
    }

    public static void tinhHieu() {
        System.out.println((a - b));
    }

}
