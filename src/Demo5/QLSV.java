/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class QLSV {

    Scanner sc = new Scanner(System.in);

    ArrayList<SinhVienPoly> listSV = new ArrayList<>();

    public void menu() {
        listSV.add(new SinhVienPoly("a", 9, "111"));
        listSV.add(new SinhVienPoly("bb", 4, "222"));
        listSV.add(new SinhVienPoly("Ccc", 10, "333"));
        listSV.add(new SinhVienPoly("đ", 2, "444"));
        listSV.add(new SinhVienPoly("000", 5, "555"));
        listSV.add(new SinhVienPoly("Trang", 6, "666"));
        listSV.add(new SinhVienPoly("g", 6, "666"));

//        listSV.remove(5);
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. In ra điểm của tất cả SV");
            System.out.println("4. In ra SV trong khoảng điểm");
            System.out.println("5. Tìm SV theo tên");
            System.out.println("6. Xoá SV theo mã");
            System.out.println("7. Sắp xếp SV theo điểm");
            System.out.println("8. In ra điểm của SV ở vị trí bất kỳ");
            System.out.println("9. Sửa thông tin SV");
            System.out.println("10. In ra top 3 theo điểm");

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
                case 5:
                    timSVTen();
                    break;
                case 6:
                    xoaSVMa();
                    break;
                case 7:
                    sapXepDiem();
                    System.out.println("==============");
                    sapXepTen();
                    break;
                case 8:
                    diemViTri();
                    break;
                case 9:
                    suaTT();
                    break;
                case 10:
                    top3Diem();
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

    public void diemViTri() {
        int viTri = listSV.size();
        // lấy ra đối tượng-> lấy điểm vị trí cuối cùng
        System.out.println(listSV.get(viTri - 1).getDiem());
    }

    public void top3Diem() {
        Collections.sort(listSV, (o1, o2) -> Double.compare(o1.getDiem(), o2.getDiem()));
        Collections.reverse(listSV);// đảo ngược list
        for (int i = 0; i < 3; i++) {
            System.out.println(listSV.get(i));
        }
    }

    public void suaTT() {
        System.out.print("Mời nhập mã cần sửa: ");
        String maNhap = sc.nextLine();
        int viTri = 0;
        for (SinhVienPoly xxx : listSV) {
            if (maNhap.equalsIgnoreCase(xxx.getMssv())) {
                System.out.print("Mời nhập điểm: ");
                double grade = Double.parseDouble(sc.nextLine());
                System.out.print("Mời nhập tên: ");
                String name = sc.nextLine();
            
//                viTri = listSV.indexOf(xxx);
//                SinhVienPoly aaa = new SinhVienPoly(name, grade, maNhap);
                listSV.set(listSV.indexOf(xxx), new SinhVienPoly(name, grade, maNhap));
                break;
            }
        }

    }

    public void xoaSVMa() {
        System.out.print("Nhập mã cần tìm: ");
        String nhapMa = sc.nextLine();
        for (SinhVienPoly sv : listSV) {
            if (nhapMa.equals(sv.getMssv())) {
                listSV.remove(sv);// xóa 1 Object trong list
                break;
            }
        }
    }

    // tiêu chí so sánh
    // dùng biểu thức lambda( có từ java 8 trở lên)
    public void sapXepDiem() {
        Collections.sort(listSV, (o1, o2) -> Double.compare(o1.getDiem(), o2.getDiem()));
//        Collections.reverse(listSV);// đảo ngược
        xuat();
    }

    public void sapXepTen() {//0-9A-Za-z đ ê 
        Collections.sort(listSV, (z1, z2) -> z1.getHoTen().compareTo(z2.getHoTen()));
        listSV.forEach(x -> System.out.println(x));// foreach dùng lambda
    }

    public void xuat() {
        listSV.forEach(x -> System.out.println(x));
    }

    public void timSVTen() {
        System.out.print("Nhập tên cần tìm: ");
        String nhapTen = sc.nextLine();

        for (SinhVienPoly sv : listSV) {
            if (nhapTen.equalsIgnoreCase(sv.getHoTen())) {//so sánh 2 chuỗi
                System.out.println(sv.toString());
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

    public void xuatTheoDiem() {
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
            if (aaa.getDiem() >= min
                    && aaa.getDiem() <= max) {
                System.out.println(aaa);
            }
        }
    }
}
