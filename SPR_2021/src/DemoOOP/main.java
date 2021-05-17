/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoOOP;


/**
 *
 * @author minhdq
 */
public class main {

    public static void main(String[] args) {
        // khai báo và khởi tại đối tượng
        
        DienThoai dt = new DienThoai(2016, "mac", "bạc");
//        dt.hangSX = "Iphone";
//        dt.mauSac = "Màu hường";
//        dt.namSX = 2020;
//        dt.nemCho();
//        System.out.println(dt);
        
        DienThoai dt2 = new DienThoai();
        dt2.setHangSX("");
        
        dt2.setGia(2000);
        System.out.println(dt2.getGia());
        
        
        
        
    }
}
