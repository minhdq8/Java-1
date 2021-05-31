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
    public String tenHang;
    public int namSX;
    public double giaTien;
    // phương thức
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
                + " giaTien=" + giaTien + " xếp loại: "+xepLoai()+ '}';
    }
    public String xepLoai(){
        String xl = this.namSX > 2018 ? "Mới" : "Cũ rích";
        return xl;
    }
    public static void main(String[] args) {
        LapTop lt = new LapTop("macbook", 2021, 2000);
        System.out.println(lt.toString());

        LapTop lt2 = new LapTop(2016);
        System.out.println(lt2.toString());
    }
}
