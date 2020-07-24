/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

public class QLSV {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setTuoi(10);
        sv1.hoTen = " ";
        System.out.println(sv1.getDiem());
        SinhVien sv2 = new SinhVien("minh", 30, 3.7);
        System.out.println(sv2.getTuoi());
        
    }
   
}
