/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo7;

/**
 *
 * @author minhdq
 */
public class NhanVien {
    public String _hoTen;
    protected String _maNV;
    int _namSinh;
    private double _luongLau;

    public NhanVien(String _hoTen, String _maNV, int _namSinh, double _luongLau) {
        this._hoTen = _hoTen;
        this._maNV = _maNV;
        this._namSinh = _namSinh;
        this._luongLau = _luongLau;
    }
    public void xuatTT(){
        System.out.print("Tên : " + this.getHoTen());
        System.out.print("\tmã : " + this.getMaNV());
        System.out.print("\tnăm : " + this.getNamSinh());
        System.out.print("\tlương : " + this.getLuongLau());
    }
    
    @Override
    public String toString() {
        return "NhanVien{" + "_hoTen=" + _hoTen + ", _maNV=" + _maNV + ", _namSinh=" + _namSinh + ", _luongLau=" + _luongLau + '}';
    }

    public String getHoTen() {
        return _hoTen;
    }

    public void setHoTen(String _hoTen) {
        this._hoTen = _hoTen;
    }

    public String getMaNV() {
        return _maNV;
    }

    public void setMaNV(String _maNV) {
        this._maNV = _maNV;
    }

    public int getNamSinh() {
        return _namSinh;
    }

    public void setNamSinh(int _namSinh) {
        this._namSinh = _namSinh;
    }

    public double getLuongLau() {
        return _luongLau;
    }

    public void setLuongLau(double _luongLau) {
        this._luongLau = _luongLau;
    }
    
    
}
