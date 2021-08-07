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
public class SepOSin extends NhanVien{
    double _trachNhiem;

    public SepOSin(double _trachNhiem, String _hoTen, String _maNV, int _namSinh, double _luongLau) {
        super(_hoTen, _maNV, _namSinh, _luongLau);
        this._trachNhiem = _trachNhiem;
    }

    @Override
    public void xuatTT() {
        super.xuatTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("\t trách nhiệm " + this._trachNhiem);
    }

}
