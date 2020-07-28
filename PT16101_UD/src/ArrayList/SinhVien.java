/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Scanner;

public class SinhVien {
    static Scanner sc = new Scanner(System.in);
    // constructor/ hàm tạo/ pthuc khởi tạo-> tạo ra các đối tượng
    public SinhVien(){// ko tham số
    }
    public SinhVien(String hoTen, int tuoi, double diem){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }
    public SinhVien(double diem) {
        this.diem = diem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
// get: lấy gtri thuộc tính
    public double getDiem() {
        return diem;
    }
// set: gán gtri cho thuộc tính
    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    // thuộc tính(trường)
    String hoTen;
    private int tuoi;
    private double diem;
    // phương thức
    public void nhapTT(){
        System.out.print("Nhập tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập điểm: ");
        diem = Double.parseDouble(sc.nextLine());
    }
    public void xuatTT(){
        System.out.println("Tên là : " + hoTen);
        System.out.println("Tuổi là : " + tuoi);
        System.out.println("Điểm là : "+ diem);
        //hluc
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", diem=" + diem + '}';
    }
    
    
}
