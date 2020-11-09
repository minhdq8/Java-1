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
public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        // cách gọi hàm
        tinhTong(a, b);
    }

       
    // kiểu dữ liệu trả về  
    /* void ko có return, còn lại có
       trả về giá trị của hàm đó
    */
    public static int tinhTong(int a1, int b1) {
        return a1 + b1;
    }
    
    // tham số truyền vào
    /* 1. Kiểu dữ liệu phù hợp
       2. Thứ tự tham số truyền vào
       3. Có thể có tham số hoặc ko 
    */
    // hàm tính tổng
    public static void tinhTong1(int a1, int b1) {
        System.out.println("Tổng: " + (a1 + b1));

    }
    public static void tinhTong(int a1, String name1) {
        System.out.println("Tổng: " + a1 + "Tên "+  name1);

    }

    public static void tinhHieu() {
        int a = 10, b = 11;
        System.out.println("Hiệu: " + (a - b));

    }

    // switch case
    public static void main02(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sự lựa chọn: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng đề về 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Lô 30 x 3 ");
                break;
            case 2:
                System.out.println("Đi tù lúc 28 tuổi");
                break;

            default:
                System.out.println("mắt điếc à?");
                break;
        }

    }

    // toán tử 3 ngôi
    public static void main01(String[] args) {
        int a = 91, b = 12, c = 90;

        int max = (a > b) ? a : b;
        int max2 = (max > c) ? max : c;
        String soSanh = (a > b) ? "a lớn nhất" : "b lớn nhất";

//        System.out.println(max);
        System.out.println(max2);
    }
}
