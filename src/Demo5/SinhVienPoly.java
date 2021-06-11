/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

/**
 *
 * @author minhdq
 */
public class SinhVienPoly {
    
    private String hoTen;
    private double diem;
    private String mssv;

    public SinhVienPoly(String hoTen, double diem, String mssv) {
        this.hoTen = hoTen;
        this.diem = diem;
        this.mssv = mssv;
    }

    public SinhVienPoly(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SinhVienPoly() {
    }
    
    public String getHoTen() {// lấy gtri của thuộc tính
        return hoTen;
    }

    public void setHoTen(String hoTen) {// gán gtri cho thuộc tính
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public String toString() {
        return "SinhVienPoly{" + "hoTen=" + hoTen + ", diem=" + diem + ", mssv=" + mssv + '}';
    }
}
