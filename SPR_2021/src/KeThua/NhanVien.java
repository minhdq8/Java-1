/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThua;

import sauTet.*;

/**
 *
 * @author minhdq
 */
public class NhanVien {
    // thuộc tính
    private String manv;
    private String hoTen;
    private double luong;
    // phương thức

    @Override
    public String toString() {
        return "NhanVien{" + "manv=" + manv + ", hoTen=" + hoTen + ", luong=" + luong + '}';
    }

    public NhanVien(String manv, String hoTen, double luong) {
        this.manv = manv;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap(){
        return luong - getThueTN();
        
    }
    public double getThueTN(){
        double thue = 0;
        if(thue > 9000000){
            thue = luong * 0.1;
        }
        return thue;
    }
    public void xuatThongTin(){
        System.out.println("Show info NV");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương: " + luong);
        System.out.println("Mã: " + manv);
        System.out.println("Thu Nhap: "+ getThuNhap());
    }
}
