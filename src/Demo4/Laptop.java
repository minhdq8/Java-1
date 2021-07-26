/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.util.Scanner;

/**
 *
 * @author minhdq
 * OOP: object oriented programing: ltrinh hướng Đối tượng
 * 4 tính chất:
 *  Đóng gói ; Kế thừa; Trừu tượng; Đa hình
 */
public class Laptop {
    // thuộc tính || trường dữ liệu
    public String _hangSX;
    private double _giaTien;
    String _mauSac;
    protected int _namSX;
    // phương thức
    // constructor/ pthuc khởi tạo
    // mặc định có 1 constructor ko tham số
    // tạo 1 cons mới thì cons mặc định mất đi
    public Laptop(String _hangSX, double _giaTien, String _mauSac, int _namSX) {
        this._hangSX = _hangSX;
        this._giaTien = _giaTien;
        this._mauSac = _mauSac;
        this._namSX = _namSX;
    }

    public Laptop(double _giaTien, String _mauSac) {
        this._giaTien = _giaTien;
        this._mauSac = _mauSac;
    }

    public Laptop(String _hangSX, String _mauSac, int _namSX) {
        this._hangSX = _hangSX;
        this._mauSac = _mauSac;
        this._namSX = _namSX;
    }
    
    public Laptop() {
    }
    
    
    // setter và getter

    public String getHangSX() {
        return _hangSX;
    }

    public void setHangSX(String _hangSX) {
        this._hangSX = _hangSX;
    }

    public String getMauSac() {
        return _mauSac;
    }

    public void setMauSac(String _mauSac) {
        this._mauSac = _mauSac;
    }

    public int getNamSX() {
        return _namSX;
    }

    public void setNamSX(int _namSX) {
        this._namSX = _namSX;
    }

    public double getGiaTien() {
        return _giaTien;
    }

    public void setGiaTien(double _giaTien) {
        if(_giaTien < 0 ){
            System.out.println("Tiền lớn hơn 0");
        }else {
            this._giaTien = _giaTien;
        }
        //phân biệt tham số và thuộc tính
    }
    
    public void nhapTT(){
        Scanner _sc = new Scanner(System.in);
        System.out.print("Mời nhập hãng: ");
        _hangSX = _sc.nextLine();
        System.out.print("Mời nhập màu: ");
        _mauSac = _sc.nextLine();
        System.out.print("Mời nhập giá: ");
        setGiaTien(Double.parseDouble(_sc.nextLine()));
    }

    @Override
    public String toString() {
        return "Laptop{" + "_hangSX=" + _hangSX + ", _giaTien=" + _giaTien + ", _mauSac=" + _mauSac +", _thue"+tinhThue() +'}';
    }
    public double tinhThue(){
        return (_giaTien * 0.1);
    }
    public double tinhThue(double _thue){
        return (_thue * 0.1);
    }
}
