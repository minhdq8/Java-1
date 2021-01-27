/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoArrayList;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class LapTop {
    // thuộc tính
    public String hangSX;
    private int namSX;
    private String mauSac;
    
    // phương thức
    // get: lấy gtri thuộc tính
    public String getHangSX() {
        return hangSX;
    }
    // set: gán gtri cho thuộc tính
    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

//    public int getNamSX() {
//        return namSX;
//    }
//
//    public void setNamSX(int namSX) {
//        this.namSX = namSX;
//    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    
    // constructor hàm tạo pthuc khởi tạo
    // trùng tên lớp, ko trả gtri
    // mặc định ko tham số, tạo 1 cái khác -> mất đi
    // tạo ra loạt ĐT khác nhau
    public LapTop() {
    }
    public LapTop(int namSX) {
        this.namSX = namSX;
    }
    public LapTop(String hangSX, int namSX, String mauSac) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.mauSac = mauSac;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng :");
        this.hangSX = sc.nextLine();
        System.out.print("Nhập năm :");
        this.namSX = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập màu :");
        this.mauSac = sc.nextLine();
    }
    public void xuatTT(){
        System.out.println(hangSX + namSX + mauSac);
    }

    @Override
    public String toString() {
        return "LapTop{" + "hangSX=" + hangSX + ", namSX=" + namSX + ", mauSac=" + mauSac + '}';
    }

    
    
    
    public void choiGame(){
        System.out.println("Chim sẻ đi nắng");
    }
    public void hocCode(){
        System.out.println("Code gì tầm này");
    }
    
}
