/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Menu {

    static Scanner _sc = new Scanner(System.in);
    static int _tuoi;
    
    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
    // hàm, fuction
    public static void menu() {
        
        System.out.println("1. Tính lương");
        System.out.println("2. Tính thuế");
        System.out.println("0. Siêu thoát");
        System.out.println("----------------");
        System.out.print("Mời nhập sự lưa chọn: ");
        int luaChon = Integer.parseInt(_sc.nextLine());
        switch (luaChon) {
            case 1:
                tinhLuong();
                break;
            case 2:
                tinhThue();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Nhập từ 1->3 thôi");
        }
    }

    public static void tinhLuong() {
        
        double _luong = 100000;
        _luong = _sc.nextDouble();
        System.out.println(_luong * 10);
    }

    public static void tinhThue() {
        
        double thue = 1000;
        System.out.println(thue*0.1);
        
    }
}
