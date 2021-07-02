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
    static int _tuoi = 10;

    public static void main(String[] args) {
        while(true){
            menu();
        }
    }
    // định nghĩa hàm
    public static void menu() {
        System.out.println("========MENU========");
        System.out.println("1. Rủ đi xem film");
        System.out.println("2. Ra hồ tây hóng ...");
        System.out.println("3. Cách ly theo cặp");
        System.out.println("0. Siêu thoát");
        System.out.println("===================");

        System.out.print("Nhập sự lựa chọn: ");
        int _luaChon = Integer.parseInt(_sc.nextLine());

        switch (_luaChon) {
            case 1:
                xemFilm();// cách gọi hàm
                break;
            case 2:
                dapXe();
                break;
            case 3:
                vongLap();
                System.out.println("Sống chết có nhau");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Mắt điếc à? từ 0-3 thôi thánh");
                break;
        }
    }
    public static void xemFilm() {
        System.out.println("Film hành động");
        System.out.println(_tuoi);
    }
    public static void dapXe() {
        int _tuoi = 20;
        System.out.println("Đạp đạp đạp mãi đạp nữa");
        System.out.println(_tuoi);
    }
    public static void vongLap(){
//        for(int i = 0; i < 5; i++ ){
//            System.out.println(i);
//        }
        while(_tuoi < 18){
            System.out.println("Còn lâu mới biết thế nào là + ");
            _tuoi ++;
        }
//        do {            
//            System.out.println("in ít nhất 1 lần");
//        } while (_tuoi < 5);
    }
}
