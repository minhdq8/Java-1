/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class QLSV {

    Scanner sc = new Scanner(System.in);

    ArrayList<SinhVienPoly> listSV = new ArrayList<>();

    public void menu() {
        listSV.add(new SinhVienPoly("a", 9, "123"));
        listSV.add(new SinhVienPoly("bb", 4, "123"));
        listSV.add(new SinhVienPoly("ccc", 10, "123"));
        listSV.add(new SinhVienPoly("minh", 2, "123"));
        listSV.add(new SinhVienPoly("vvv", 5, "123"));
        listSV.add(new SinhVienPoly("minh", 6, "123"));

        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. In ra điểm của tất cả SV");
            System.out.println("4. In ra SV trong khoảng điểm");
            System.out.println("5. Sửa thông tin SV");
            System.out.println("6. Xoá SV");
            System.out.println("7. Sắp xếp SV theo điểm");
            System.out.println("8. In ra điểm của SV ở vị trí cuối cùng");
            System.out.println("0. Kết thúc");

            System.out.print(">> Chọn chức năng: ...  ");
            int so = Integer.parseInt(sc.nextLine());
            System.out.println("======================");
            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatTheoDiem();
                    break;
                case 4:
                    xuatTheoKhoangDiem();
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
            String name = sc.nextLine();
            System.out.print("Mời nhập điểm: ");
            double grade = Double.parseDouble(sc.nextLine());
            System.out.print("Mời nhập MSSV: ");
            String rollNumber = sc.nextLine();

            SinhVienPoly sv = new SinhVienPoly(name, grade, rollNumber);
            listSV.add(sv);// thêm đối tượng sv vào list

            // tiếp hay ko ?
            System.out.print("Nhập tiếp ko (Y/N)? :  ");
            if (sc.nextLine().equalsIgnoreCase("n")) {// ko phân biệt hoa thường
                break;
            }
        }
    }

    public void xuat() {
//        for(int i = 0; i < listSV.size(); i++){
//            System.out.println(listSV.get(i));
//        }
        for (SinhVienPoly aaa : listSV) {
            System.out.println(aaa);
        }
    }

    private void xuatTheoDiem() {
        for (SinhVienPoly aaa : listSV) {
            System.out.println(aaa.getDiem());
        }
//        for(int i = 0; i < listSV.size(); i++){
//            System.out.println(listSV.get(i).getDiem());
//        }
    }

    public void xuatTheoKhoangDiem() {
        System.out.print("Nhập min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập max: ");
        int max = Integer.parseInt(sc.nextLine());
        for (SinhVienPoly aaa : listSV) {
            if (aaa.getDiem() >= min && aaa.getDiem() <= max) {
                System.out.println(aaa);
            }
        }
    }
}
