/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoOOP;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class DienThoai {
    // thuộc tính
    private int namSX;
    private String hangSX;
    private String mauSac;
    private double gia;
    // phương thức
    
    // get: trả về giá trị của thuộc tính
    public double getGia() {    
        return gia;
    }
    // gán gtri cho thuộc tính
    public void setGia(double gia) {    
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    // constructor/hàm tạo/pthuc khởi tạo
    // khai báo 1 con mới thì mặc định mất đi
    // cách tạo ĐT khác nhau
    public DienThoai() {
    }
    public DienThoai(String hangSX) {
        this.hangSX = hangSX;
    }
    public DienThoai(int namSX, String hangSX, String mauSac) {
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.mauSac = mauSac;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        this.namSX = Integer.parseInt(sc.nextLine());
        
    }
    public String xepLoai(){
        if (namSX > 2000)
            return "mới ghê";
        else 
            return "cũ thế";
        
    }
    public void nemCho(){
        System.out.println("Iphone ném cho chất");
    }

    @Override
    public String toString() {
        return "DienThoai{" + "namSX=" + namSX + ", hangSX=" + hangSX + ", mauSac=" + mauSac + "XL :"+xepLoai()+ '}';
    }
    
}
