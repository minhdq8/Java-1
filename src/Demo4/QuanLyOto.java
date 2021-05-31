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
public class QuanLyOto {
    public static void main(String[] args) {
        // khai báo và khởi tạo 1 đối tượng oto tên mec
        Oto mec = new Oto();
        mec.hangSX = "mec GLK";
        mec.setNamSX(2021);
        mec.mauSac = "đen tuyền bóng sáng";
        System.out.println(mec.toString());
        
//        Oto xe1 = new Oto("đen bạc", 2021, "Apple");
//        xe1.hienThiTT();
//        
//        Oto xe2 = new Oto("bạc");
//        xe2.hienThiTT();
    }
}
