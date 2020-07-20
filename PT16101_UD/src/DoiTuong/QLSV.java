/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

public class QLSV {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        
        SinhVien sv2 = new SinhVien("minh", 30, 3);
        
    }
    public static void main01(String[] args) {
        // khai báo và khởi tại 1 đối tượng sinh vien
        SinhVien sv1 = new SinhVien();
        sv1.nhapTT();
        sv1.tuoi = 10;
        sv1.diem = 8;
        SinhVien anNGu = new SinhVien();
        anNGu.nhapTT();
        anNGu.tuoi = 20;
        System.out.println("Thông tin toàn bộ SV");
        sv1.xuatTT();
        System.out.println("Tuổi là : " + anNGu.tuoi);
        
        
    }
}
