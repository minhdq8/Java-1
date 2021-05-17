/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Demo2 {

    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);

        String _hoTen, _dangNguoi;
        double _chieuCao, _soDoVong3;

        int a = 5;
        double b = 9.4;
//        b = a;// b = 5
        a = (int) b;

        System.out.println(b);
        System.out.println(a);

        // ép kiểu chuỗi -> KDL nguyên thủy
        int _tuoi = Integer.parseInt("34");// + enter
        double _diemTB = Double.parseDouble("15");

        System.out.println(_tuoi + _diemTB);

        System.out.print("Mời nhập họ tên: ");
        _hoTen = _sc.nextLine();

        try {
            System.out.print("Mời nhập số đo vòng 3: ");
            _soDoVong3 = Double.parseDouble(_sc.nextLine());
//        _sc.nextLine();// 96 + Enter = String
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Mời nhập lại số thập phân!");
            return ;
        }

        System.out.print("Mời nhập dáng người: ");
        _dangNguoi = _sc.nextLine();

        try {
            System.out.print("Mời nhập chiều cao: ");
            _chieuCao = Double.parseDouble(_sc.nextLine());
        } catch (Exception e) {
            System.out.println("Nhập lại chiều cao đê!");
        }

    }
}
