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
public class QLDienThoai {
    public static void main(String[] args) {
        // khai báo và khởi tạo đối tượng
        DienThoai iphone = new DienThoai();
//        iphone.namSX = 2020;
//        iphone.mauSac = "Xanh dương";
//        iphone.ten = "Iphone 12 Pro max";
//        iphone.hangSX = "Apple cắn dở";
//        iphone.nhapTT();
//        
//        iphone.choiDienTu();
//        iphone.noiChuyen();
        
        DienThoai samSung = new DienThoai("aa", "bbb", 0, "cc");
        samSung.choiDienTu();

        
    }
}
/*
OOP: 4 tính chất
    Đóng gói, kế thừa, trừu tượng, đa hình



Tạo class hình học
- thuộc tính
-pthuc:nhập, diện tích, chu vi

-> tạo đối tượng:
    - hình chữ nhật: gọi đến pthuc
*/
