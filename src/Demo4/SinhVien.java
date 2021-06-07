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
public class SinhVien {
    // thuộc tính
    public String hoTen;
    private double diem;
    
    // Phương thức
    public String getHoTen(){
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    
    public void setDiem(double diem) {
        this.diem = diem;
    }

    public SinhVien() {
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    public void nhapTT() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập điểm: ");
        this.diem = Double.parseDouble(sc.nextLine());
    }
    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diem=" + diem 
                +", học lực " + hocLuc() +'}';
    }
    public String hocLuc(){
        String hocLuc = this.diem > 5 ? "giỏi" : "yếu";
        return hocLuc;
    }
    
}
