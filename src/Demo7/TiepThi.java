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
public class TiepThi extends NhanVien{
    double _hoaHong;

    public TiepThi(double _hoaHong, String _hoTen, String _maNV, int _namSinh, double _luongLau) {
        super(_hoTen, _maNV, _namSinh, _luongLau);
        this._hoaHong = _hoaHong;
    }

    @Override
    public void xuatTT() {
        super.xuatTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("\t hoa hồng " + this._hoaHong);
    }

    
}
