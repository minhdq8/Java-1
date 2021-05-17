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
public class ThamSo_KDL {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    public static void menu() {

        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");

        System.out.println("==================");

        System.out.print("Mời bạn nhập lựa chọn s: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
                tinhTong();
                break;
            case 2:
                int ccc = Integer.parseInt(sc.nextLine());
                int xxx = Integer.parseInt(sc.nextLine());
                double bbb = 9.5;
                tinhTong(ccc, bbb);
                break;
            case 3:
                System.out.println(tinhTong1()); //tinhTong1();
                break;
            case 4:
                int a1 = 10,
                 b1 = 11;
                System.out.println(tinhTong1(a1, b1));
                break;
            case 5:
                int i = 10; double c = 11.11;
                tinhTong(i ,c);
                break;
            case 6:

                System.exit(0);
            default:
                System.out.println("quay xe e ơi(1->4)");
                break;
        }
    }
    //hàm ko có tham số, ko có KDL trả về
    public static void tinhTong() {
        int a = 10, b = 10;
        System.out.println(a + b);
    }
    // có tham số, ko có KDL trả về
    public static void tinhTong(int a, int b) {
        System.out.println(a + b);
    }
    // có KDL trả về, ko có tham số
    public static int tinhTong1() {
        int a = 1, b = 2;
        return a+b; // trả về giá trị của hàm
    }
    // có KDL trả về, có tham số truyền vào
    public static int tinhTong1(int a, int b) {
        return a + b;
    }
    // 1. thứ tự tham số truyền vào
    // 2. kiểu DL của tham số 
    public static void tinhTong(int a, double b) {
        System.out.println(a + b);
    }
}
