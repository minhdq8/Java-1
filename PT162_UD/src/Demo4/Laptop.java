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
public class Laptop {
    // thuộc tính
    private String hangSX;
    public int namSX;
    double kichCo;
    // phương thức

    public Laptop() {
    }

    public Laptop(String hangSX, int namSX, double kichCo) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.kichCo = kichCo;
    }
    
    
    // trả về gtri của thuộc tính
    public String getHangSX() {
        return hangSX;
    }
    // gán gtri cho thuộc tính
    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getKichCo() {
        return kichCo;
    }

    public void setKichCo(double kichCo) {
        this.kichCo = kichCo;
    }
    
    public void goPhim(){
        System.out.println("Laptop gõ sướng hơn PC");
    }
    public void xemFilm(){
        System.out.println("Ôm xem rồi ngủ");
    }
}
