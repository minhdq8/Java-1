/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo7_8;

/**
 *
 * @author minhdq
 */
public class TiepThi extends NhanVien{
    double doanhSo;

    public TiepThi(double doanhSo, String ten, String ma, double luong) {
        super(ten, ma, luong);
        this.doanhSo = doanhSo;
    }

    
    @Override
    public void getThue(){
        System.out.println("tính thuế kiểu khác cha");
    }
    
}
