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
public class QLDienThoai {

    static Scanner _sc = new Scanner(System.in);
    ArrayList<DienThoai> _listDT = new ArrayList<>();

    public void menu() {
        System.out.println("1. Nhập danh sách điện thoại");
        System.out.println("2. Xuất danh sách điện thoại");
        System.out.println("3. In ra năm SX của tất cả ĐT");
        System.out.println("4. In ra ĐT trong khoảng năm");
        System.out.println("5. Tìm ĐT theo tên");
        System.out.println("6. Xoá ĐT theo hãng");
        System.out.println("7. Sắp xếp ĐT theo giá");
        System.out.println("8. In ra năm của ĐT ở vị trí bất kỳ");
        System.out.println("9. Sửa thông tin ĐT");
        System.out.println("10. In ra top 3 theo giá");

        System.out.println("0. Kết thúc");

        System.out.print(">> Chọn chức năng: ...  ");
        int so = Integer.parseInt(_sc.nextLine());
        System.out.println("======================");
        switch (so) {
            case 1:
                nhapTT();
                break;
            case 2:
                xuatTT();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng chọn số từ 0 đến 6!");
                break;

        }
    }

    public void nhapTT() {
        while (true) {
            System.out.print("Mời nhập năm SX: ");
            int _namSX = Integer.parseInt(_sc.nextLine());
            System.out.print("Mời nhập hãng SX: ");
            String _hangSX = _sc.nextLine();
            System.out.print("Mời nhập tên ĐT: ");
            String _ten = _sc.nextLine();

            DienThoai dt = new DienThoai(_hangSX, _namSX, _ten);
            _listDT.add(dt);

            System.out.print("Nhập tiếp hay không? (Y/N): ....");
            String _tiepKo = _sc.nextLine();
            if (_tiepKo.equalsIgnoreCase("N")) {// so sánh ko phân biệt hoa thường
                break;
            }
        }
    }

    public void xuatTT() {
        System.out.println("=====List danh sách Điện thoại=====");
        for (int i = 0; i < _listDT.size(); i++) {
            System.out.println(_listDT.get(i));
        }
    }
}
