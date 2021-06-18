/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo7_8;

/**
 *
 * @author minhdq
 */
public class NhanVien {
    public String ten;
    public String ma;
    public double luong;

    public NhanVien(String ten, String ma, double luong) {
        this.ten = ten;
        this.ma = ma;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ten=" + ten + ", ma=" + ma + ", luong=" + luong + '}';
    }
    
    public void getThue(){
        System.out.println(" tính thuế cha");
    }
    
}
