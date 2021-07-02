/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuaBai;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Bai56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // khai báo và khởi tạo đối tượng scanner
        Scanner _sc = new Scanner(System.in);

        System.out.print("nhập tên: ");
        String ten = _sc.nextLine();// phím nào cũng ok
        System.out.print("nhập tuổi: ");
//        int tuoi = _sc.nextInt();// 30 + enter = string
//        _sc.nextLine();
        int tuoi = Integer.parseInt(_sc.nextLine());
        // ép kiểu từ String sang KDL nguyên thủy
        System.out.print("nhập dáng: ");
        String dang = _sc.nextLine();

        System.out.println(ten + tuoi + dang);

    }

}
