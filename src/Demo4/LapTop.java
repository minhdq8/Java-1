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
public class LapTop {

    // thuộc tính
    String tenHang;
// default: public cùng gói, private khác gói
    private int namSX;// chỉ trong class
    public double giaTien;// thoải mái
    // phương thức

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSX() {//lấy giá trị thuộc tính
        return namSX;
    }

    public void setNamSX(int namSX) {// gán gtri cho thuộc tính
        this.namSX = namSX;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public LapTop(String tenHang, int namSX, double giaTien) {
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.giaTien = giaTien;
    }

    public LapTop(int namSX) {
        this.namSX = namSX;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng:");
        this.tenHang = sc.nextLine();
        System.out.print("Nhập năm:");
        this.namSX = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá:");
        this.giaTien = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "LapTop{" + "tenHang=" + tenHang + ", namSX=" + namSX + ","
                + " giaTien=" + giaTien + " xếp loại: " + xepLoai() + '}';
    }

    public String xepLoai() {
        String xl = this.namSX > 2018 ? "Mới" : "Cũ rích";
        return xl;
    }

}
