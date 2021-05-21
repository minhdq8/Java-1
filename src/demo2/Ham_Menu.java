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
public class Ham_Menu {
    
    static Scanner _sc = new Scanner(System.in);
    static String name = "minh";
    public static void main(String[] args) {
        menu();
        System.out.println(name);
    }
    // hàm, fuction
    public static void menu(){
        // switch case
//        Scanner _sc = new Scanner(System.in);
        System.out.println("1. Tính tổng");
        System.out.println("2. Tính hiệu");
        System.out.println("0. Siêu thoát");
        System.out.println("---------------");
        while(true){
            System.out.print("Mời nhập sự lựa chọn: ");
            int luaChon = Integer.parseInt(_sc.nextLine());
            
            switch(luaChon){
                case 1: tinhTong();
                    break;
                case 2: tinhHieu();
                    break;
                case 0: System.exit(0);
                default: System.out.println("Nhập từ 0 -> 2 thôi!");
                    break;
            }
        }
    }
    public static void tinhTong(){
//        Scanner _sc = new Scanner(System.in);
        int a = 5, b = 10;
        a = _sc.nextInt();
        System.out.println("Tổng là : " + (a + b));
        tinhHieu();
    }
    public static void tinhHieu(){
        int a = 5, b = 10;
        System.out.println("Hiệu là : " + (a - b));
        System.out.println(name);
    }
}
