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
public class DienThoai {
    public String hangSX;
    int namSX;
    private String mauSac;
    protected double kichCo;

    public DienThoai() {
    }

    public DienThoai(String hangSX, int namSX, String mauSac, double kichCo) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.mauSac = mauSac;
        this.kichCo = kichCo;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double getKichCo() {
        return kichCo;
    }

    public void setTen(double kichCo) {
        this.kichCo = kichCo;
    }
    
    
    public void showInfo(){
        System.out.println("Lớp cha");
    }
    
}
