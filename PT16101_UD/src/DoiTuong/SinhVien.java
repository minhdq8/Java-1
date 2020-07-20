/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

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
    
    
    // thuộc tính(trường)
    String hoTen;
    int tuoi;
    double diem;
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
    
}
