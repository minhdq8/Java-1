package DemoFull;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {

    Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVienPoly> listSV = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên theo khoảng điểm");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("5. Sửa thông tin SV");
            System.out.println("6. Xoá SV");
            System.out.println("0. Kết thúc");

            System.out.print(">> Chọn chức năng: ...  ");
            int so = sc.nextInt();
            System.out.println("======================");
            sc.nextLine();
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
//                case 4:
//                    timTheoTen();
//                    break;
//                case 5:
//                    sua();
//                    break;
//                case 6:
//                    xoa();
//                    break;

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
            listSV.add(sv);
            // tiếp hay ko ?
            System.out.print("Nhập tiếp (Y/N)? ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    private void xuat() {
        for(SinhVienPoly xxx : listSV){
            System.out.println(xxx);
        }
    }

    private void xuatTheoDiem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
