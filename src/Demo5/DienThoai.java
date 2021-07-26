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
public class DienThoai {
    private String _hangSX;
    private int _namSX;
    private String _ten;

    public DienThoai(String _hangSX, int _namSX, String _ten) {
        this._hangSX = _hangSX;
        this._namSX = _namSX;
        this._ten = _ten;
    }
    public DienThoai() {
    }

    @Override
    public String toString() {
        return "DienThoai{" + "_hangSX=" + _hangSX + ", _namSX=" + _namSX + ", _ten=" + _ten + '}';
    }

    public String getHangSX() {
        return _hangSX;
    }

    public void setHangSX(String _hangSX) {
        this._hangSX = _hangSX;
    }

    public int getNamSX() {
        return _namSX;
    }

    public void setNamSX(int _namSX) {
        this._namSX = _namSX;
    }

    public String getTen() {
        return _ten;
    }

    public void setTen(String _ten) {
        this._ten = _ten;
    }
    
    
}
