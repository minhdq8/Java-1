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

    // khai báo hàm: ngoài main nhưng trong class
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. nếu lỡ thì");
        System.out.println("2. info người yêu");
        System.out.println("3. số lần nắm tay");
        System.out.println("4. thoát nạn");
        System.out.println("==================");

        System.out.print("Mời bạn nhập: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
                neuThi();
                break;
            case 2:
                nhapXuat();
                break;
            case 3:
                congTru();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("quay xe e ơi(1->4)");
                break;
        }

    }

    public static void neuThi() {
        int a = 10, b = 20, c = 22;
        int max1 = a > b ? a : b;
        String max = max1 > c ? "thì làm sao?" : "học chán voãi";

        System.out.println(max);

        if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a bằng lòng b");
        } else {
            System.out.println("a > b");
        }
    }

    public static void congTru() {
        int h = 7, m = 5;

        int i1 = h++ + m++;// 7 + 5 8 6
        int i2 = ++h - m++;// 9 - 6 9 7
        int i3 = ++h + ++m;// 10 + 8 10 8
        int i4 = --h + ++m; // 9 + 9
        // 
//        System.out.println("" + i1); //
//        System.out.println("" + i2); //
//        System.out.println("" + i3); // 
        System.out.println("" + i4); //
    }

    public static void nhapXuat() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
//        int age = sc.nextInt();
        // fix trôi lệnh
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println(name + age);
    }
}
