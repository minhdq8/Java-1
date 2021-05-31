/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class DienThoai {

    // thuộc tính(trường)
    String ten;
    String hangSX;
    int namSX;
    String mauSac;

    // phương thức
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập hãng: ");
        this.hangSX = sc.nextLine();
        System.out.print("Nhập màu: ");
        this.mauSac = sc.nextLine();
        System.out.print("Nhập năm SX: ");
        this.namSX = Integer.parseInt(sc.nextLine());

    }
    public void xuatTT() {
        
    }

    public void noiChuyen() {
        System.out.println("Nói mỏi mồm");
        System.out.println(this.hangSX + "nghe gọi chất");
    }

    public void choiDienTu() {
        System.out.println("Tốc chiến");
    }

}
