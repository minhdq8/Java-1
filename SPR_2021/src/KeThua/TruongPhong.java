/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThua;

/**
 *
 * @author minhdq
 */
public class TruongPhong extends NhanVien{

    double trachNhiem;
    
    public TruongPhong(double trachNhiem, String manv, String hoTen, double luong) {
        super(manv, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Trách nhiệm: " + trachNhiem);
    }

}
