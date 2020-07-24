/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;


public class QLLaptop {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
//        System.out.println("Nhập thông tin");
//        lap1.nhapLT();
//        System.out.println("Xuất thông tin");
//        lap1.xuatLT();
        
        String tenToiLa = "Tôi tên là";
        int nam = 1900;
        double giaCa = 99.2324;
        
        Laptop hangCuiBap = new Laptop(tenToiLa, nam, giaCa);
        hangCuiBap.xuatLT();
        
        hangCuiBap.setGiaTien(19191);
        hangCuiBap.setTenHang("Là gì chả đc");
        hangCuiBap.xuatLT();
        
//        System.out.println(hangCuiBap.getNamSX());
        
        System.out.println(hangCuiBap.toString());
    }
}
