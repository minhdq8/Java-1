/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauTet;

import java.util.ArrayList;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;

/**
 *
 * @author minhdq
 */
public class QLNhanVien {

    static Scanner sc = new Scanner(System.in);
    // khai báo và khởi tạo list chứa đối tượng NV
    ArrayList<NhanVien> listNV = new ArrayList<>();

    public void menu() {
        listNV.add(new NhanVien("1", "1", 1));
        listNV.add(new NhanVien("2", "2", 2));
        listNV.add(new NhanVien("3", "3", 3));
        listNV.add(new NhanVien("4", "4", 4));
        listNV.add(new NhanVien("5", "5", 5));
        while (true) {
            System.out.println("1. Nhập thông tin NV");
            System.out.println("2. Xuất thông tin NV");
            System.out.println("3. Tìm NV theo mã");
            System.out.println("4. Xóa NV theo mã");
            System.out.println("0. Siêu thoát");

            System.out.print("Mời nhập lựa chọn: ");
            int luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timNV();
                    break;
                case 4:
                    xoaNV();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public void nhap() {
        System.out.println("NHẬP THÔNG TIN NV");
        while (true) {
            System.out.print("Nhập tên:");
            String hoTen = sc.nextLine();
            System.out.print("Nhập mã:");
            String maNV = sc.nextLine();
            System.out.print("Nhập lương:");
            double luong = Double.parseDouble(sc.nextLine());

            NhanVien nv = new NhanVien(maNV, hoTen, luong);
            listNV.add(nv);

            System.out.print("Y/N?");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("XUẤT THÔNG TIN NV");
        if (listNV.size() <= 0) {
            System.out.println("Danh sách rỗng, mời nhập thêm NV");
        } else {
            for (NhanVien xxx : listNV) {
                System.out.println(xxx);
            }
            
            //listNV.forEach((x) -> System.out.println(x));
        }
    }

    public void timNV() {
        System.out.print("Nhập mã NV cần tìm: ");
        String maNV = sc.nextLine();

        for (NhanVien x : listNV) {
            if (x.getManv().equalsIgnoreCase(maNV)) {
                System.out.println(x);
            }
        }
    }

    public void xoaNV() {

    }

//    public void menu(){
//        listNV.add(new NhanVien("1","1",1));
//        listNV.add(new NhanVien("2","2",2));
//        listNV.add(new NhanVien("3","3",3));
//        listNV.add(new NhanVien("4","4",4));
//        listNV.add(new NhanVien("5","5",5));
//        
//        while(true){
//            System.out.println("1. Nhập danh sách nhân viên");
//            System.out.println("2. Xuất danh sách nhân viên");
//            System.out.println("3. Tìm NV theo mã");
//            System.out.println("0. Siêu thoát");
//            
//            System.out.print("Mời nhập lựa chọn: ");
//            int luaChon = Integer.parseInt(sc.nextLine());
//            
//            switch(luaChon){
//                case 1: 
//                    nhap();
//                    break;
//                case 2: 
//                    xuat();
//                    break;
//                case 3: 
//                    timNV();
//                    break;
//                case 0 : System.exit(0);
//                default: System.out.println("Nhập lại đi!");
//                    break;
//            }
//        }
//    }
//    public void nhap(){
//        System.out.println("NHẬP DANH SÁCH NHÂN VIÊN");
//        while(true){
//            System.out.print("Nhập tên: ");
//            String ten = sc.nextLine();
//            System.out.print("Nhập mã: ");
//            String maNV = sc.nextLine();
//            System.out.print("Nhập lương:");
//            double luong = Double.parseDouble(sc.nextLine());
//            
//            NhanVien nv = new NhanVien(maNV, ten, luong);
//            listNV.add(nv);
//            
//            System.out.print("Nhập tiếp/Không: ");
//            if(sc.nextLine().equalsIgnoreCase("n")){
//                break;
//            }
//        }
//    }
//    public void xuat(){
//        System.out.println("XUẤT DANH SÁCH NHÂN VIÊN");
//        int i = 1;
//        for(NhanVien xxx : listNV){
//            System.out.printf("NV %d : ", i);
//            System.out.println(xxx);
//            i++;
//        }
//        //lambda
//        //listNV.forEach((x) -> System.out.println(x));
//    }
//    public void timNV(){
//        System.out.println("TÌM NV THEO MÃ");
//        System.out.print("Mã NV cần tìm: ");
//        String maNV = sc.nextLine();
//        
//        for(NhanVien a : listNV){
//            if(a.getManv().equalsIgnoreCase(maNV)){
//                System.out.println(a);
//            }
//        }
//    }
}
