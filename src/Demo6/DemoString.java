/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo6;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class DemoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập: ");
        String nhapVao = sc.nextLine();
        
//        String bieuThuc = "[0-9]{3,7}";
//        String bieuThuc = "0\\d{9,10}";
        String bieuThuc = "PH\\d{5}";

        if (nhapVao.matches(bieuThuc)) {
            System.out.println("Nhập chuẩn \"cơm mẹ nấu\" ");
        } else {
            System.out.println("Nhập sai");
        }

    }

    public static void main02(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User: ");
        String user = sc.nextLine();
        System.out.print("Pass: ");
        String pass = sc.nextLine();

        if (user.equals("Java")){
            System.out.println(pass.toUpperCase());
        }
    }
}
