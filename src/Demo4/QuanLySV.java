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
public class QuanLySV {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.nhapTT();
        System.out.println(sv1.toString());
        
        SinhVien sv2 = new SinhVien("Minh", 10);
        
        System.out.println(sv2.toString());
    }
}
