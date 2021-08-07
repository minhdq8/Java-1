/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class QLNV {
    static Scanner _sc = new Scanner(System.in);
    ArrayList<NhanVien> _listNV = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("0. Kết thúc");

            System.out.print(">> Chọn chức năng: ...  ");
            int so = Integer.parseInt(_sc.nextLine());
            System.out.println("======================");
            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn số từ 0 đến 6!");
                    break;
            }
        }
    }

    public void nhap() {
        while (true) {
            System.out.print("Mời nhập tên: ");
            String _hoTen = _sc.nextLine();
            System.out.print("Mời nhập lương: ");
            double _luong = Double.parseDouble(_sc.nextLine());
            System.out.print("Mời nhập mã: ");
            String _maNV= _sc.nextLine();
            System.out.print("Mời nhập năm sinh: ");
            int _namSinh = Integer.parseInt(_sc.nextLine());
            
            
            System.out.println("1. Nhân viên");
            System.out.println("2. Sếp osin");
            System.out.println("3. Tiếp thị");
            System.out.print("Mời lựa chọn chức vụ : ");
            int _luaChon = Integer.parseInt(_sc.nextLine());
            switch(_luaChon){
                case 1 : 
                    _listNV.add(new NhanVien(_hoTen, _maNV, _namSinh, _luong));
                    break;
                case 2:
                    System.out.print("Mời nhập lương trách nhiệm: ");
                    double _luongTN = Double.parseDouble(_sc.nextLine());
                    _listNV.add(new SepOSin(_luongTN, _hoTen, _maNV, _namSinh, _luong));
                    break;
                case 3:
                    System.out.print("Mời nhập hoa hồng: ");
                    double _hoaHong= Double.parseDouble(_sc.nextLine());
                    _listNV.add(new TiepThi(_hoaHong, _hoTen, _maNV, _namSinh, _luong));
                    break;
            }
            
            // tiếp hay ko ?
            System.out.print("Nhập tiếp ko (Y/N)? :  ");
            if (_sc.nextLine().equalsIgnoreCase("n")) {// ko phân biệt hoa thường
                break;
            }
        }
    }
    public void xuat(){
        for(NhanVien xxx : _listNV){
            xxx.xuatTT();
        }
    }
}
