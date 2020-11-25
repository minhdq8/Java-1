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
    String hoTen;
    double diemTB;
    
    // phương thức (ko có static)
    // constructor, hàm tạo, pthuc khởi tạo
    //-> tạo ra đối tượng, các loại đối tượng khác nhau
    // khi ko khai báo constructor thì java tự động tạo 
    // ra 1 constructor ko tham số
    public SinhVien() {
    }
//
    public SinhVien(double diemTB1) {
        this.diemTB = diemTB1;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập điểm: ");
        diemTB = Double.parseDouble(sc.nextLine());
        
    }
    public void xuatTT(){
        System.out.println("Tên là: " + hoTen);
        System.out.println("Điểm là: " + diemTB );
        
    }
    public double xepLoai(){
        if(diemTB > 8){
            System.out.println("Giỏi voãi chưởng");
        }else {
            System.out.println("Khá voãi");
        }
        return diemTB;
    }
}
