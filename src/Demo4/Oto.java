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
public class Oto {
    // thuộc tính, trường
    public String mauSac;
    private int namSX;
    public String hangSX;
    
    // phương thức methord >< function hàm

    
    public int getNamSX() {// lấy gtri của thuộc tính
        return namSX;
    }
    
    public void setNamSX(int namSX) {// gán gtri cho thuộc tính
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "Oto{" + "mauSac=" + mauSac + ", namSX=" + namSX + ", hangSX=" + hangSX + '}';
    }
    
    
    // constructor, hàm tạo, pthuc khởi tạo
    // auto có 1 constructor ko tham số
    // đặc điểm: trùng tên class, ko có KDL
    public Oto(){
    }
    public Oto(String mauSac, int namSX, String hangSX){
        this.mauSac = mauSac;
        this.namSX = namSX;
        this.hangSX = hangSX;
    }

    public Oto(String hangSX) {
        this.hangSX = hangSX;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu: ");
        this.mauSac = sc.nextLine();
        System.out.print("Nhập hãng: ");
        this.hangSX = sc.nextLine();
        System.out.print("Nhập năm sx: ");
        this.namSX = Integer.parseInt(sc.nextLine());
    }
    public void chayXeGrap( String show){
        System.out.println("kiếm thêm tiền đổ xăng");
    }
    public String chayXeGrap1(){
        return "kiếm thêm tiền đổ xăng";
    }
}
