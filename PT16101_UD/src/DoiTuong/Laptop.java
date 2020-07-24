/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

import java.util.Scanner;

/*
class <- thuộc tính + phương thức
- thuộc tính: phạm vi truy xuất (4 cái: private ...)
- phương thức: tự tạo, setter getter, constructor

*/
public class Laptop {
    
    // thuộc tính
    private String tenHang;
    private int namSX;
    private double giaTien;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    
    // hàm tạo, constructor
    public Laptop(){    
    }

    public Laptop(String tenHang, int namSX, double giaTien) {
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.giaTien = giaTien;
    }

    // phương thức
    public void nhapLT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên hãng: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhập năm SX: ");
        this.namSX = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        this.giaTien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Laptop{" + "tenHang=" + tenHang + ", namSX=" + namSX + ", giaTien=" + giaTien + '}';
    }


    public void xuatLT(){
        System.out.printf("Tên: %s. Năm: %d. Giá: %.2f. Xếp loại: %s\n",
                tenHang,namSX,giaTien,xepLoaiLT(namSX)); 
    }
    public String xepLoaiLT(int namSX){
        if(namSX > 2018){
            return "mới";
        } else {
            return "cũ";
        }
    }
    
}
