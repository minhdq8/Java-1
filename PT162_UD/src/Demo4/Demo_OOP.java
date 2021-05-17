/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

/**
 *
 * @author minhdq
 */
public class Demo_OOP {

    public static void main(String[] args) {

        // khai báo và khởi tạo 1 đối tượng Laptop
        SinhVien sv1 = new SinhVien();
//        sv1.nhapTT();
//        sv1.xuatTT();
////        sv1.xepLoai();
//        sv1.xepLoai();

        SinhVien sv2 = new SinhVien(8);
        sv2.xepLoai();
        Laptop lt = new Laptop();
//        lt.hangSX = "Macbook";
        lt.setHangSX("Macccbooooook");
        lt.kichCo = 15;
        lt.namSX = 2016;
        lt.goPhim();
        
        System.out.println(lt.getHangSX());
        
//        Laptop lt2 = new Laptop();
//        lt2.hangSX = "Đeo";
//        lt2.goPhim();
    }

}
