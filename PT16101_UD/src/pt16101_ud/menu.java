/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt16101_ud;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class menu {

    // biến toàn cục, dùng cho tất cả các hàm trong class
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();

        }
    }

    // tạo hàm mới
    public static void menu() {

        System.out.println("====Menu giải trí của thánh ====");
        System.out.println("1. Nhập thông tin NYC");
        System.out.println("2. Nhập thông tin sản phẩm");
        System.out.println("0. Siêu thoát");
        System.out.print("Mời nhập sự lựa chọn: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
                nhapNYC();
                break;
            case 2:
                checkHang();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Mắt điếc à? 0 1 2 thôi thánh!");
                break;
        }
    }

    public static void nhapNYC() {

        String hoTen;
        int tuoi;
        double vong1, canNang;

        System.out.println("GHI CÔNG NYC");
        System.out.print("Nhập tên: ");
        hoTen = sc.nextLine();
    }

    public static void checkHang() {
        // nhập địa điểm, giá cả, chất lượng

        String diaDiem, chatLuong;
        double giaCa;
        System.out.print("Mời nhập địa điểm: ");
        diaDiem = sc.nextLine();
        System.out.print("Giá cả: ");
        giaCa = Double.parseDouble(sc.nextLine());
        System.out.print("Chất lượng: ");
        chatLuong = sc.nextLine();

        System.out.printf("Check ở %s giá khoảng %f có chất lượng %s !",
                diaDiem, giaCa, chatLuong);
    }


}
