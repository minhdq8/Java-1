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
 */
public class Laptop {
    // thuộc tính || trường dữ liệu
    public String _hangSX;
    double _giaTien;
    String _mauSac;
    
    // phương thức
    public void nhapTT(){
        Scanner _sc = new Scanner(System.in);
        System.out.print("Mời nhập hãng: ");
        _hangSX = _sc.nextLine();
        System.out.print("Mời nhập màu: ");
        _mauSac = _sc.nextLine();
        System.out.print("Mời nhập giá: ");
        _giaTien = Double.parseDouble(_sc.nextLine());
    }

    @Override
    public String toString() {
        return "Laptop{" + "_hangSX=" + _hangSX + ", _giaTien=" + _giaTien + ", _mauSac=" + _mauSac +", _thue"+tinhThue() +'}';
    }
    public double tinhThue(){
        return (_giaTien * 0.1);
    }
}
