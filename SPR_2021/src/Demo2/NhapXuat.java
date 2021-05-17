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
public class NhapXuat {
    static Scanner sc = new Scanner(System.in);
    public static String name = "minh chì đen";
    static int age;
    
    public static void main(String[] args) {

        while(true){
            menu();
        }
    }
    public static void menu() {
        

        System.out.println("1. Nhập info");
        System.out.println("2. Xuất info");
        System.out.println("3. ");
        System.out.println("4. thoát nạn");
        System.out.println("==================");

        System.out.print("Mời bạn nhập: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
                nhapInfo();
                break;
            case 2:
                xuatInfo();
                break;
            case 3:
                
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("quay xe e ơi(1->4)");
                break;
        }
        
}

    public static void nhapInfo() {
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
    }

    public static void xuatInfo() {
//        String name = " ok bayby";
        System.out.println(name + age);
    }
}