/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

import java.util.*;

/**
 *
 * @author minhdq
 */
public class QLDienThoai {

    static Scanner _sc = new Scanner(System.in);
    ArrayList<DienThoai> _listDT = new ArrayList<>();

    public void menu() {
        _listDT.add(new DienThoai("33", 33, "33", 33));
        _listDT.add(new DienThoai("44", 44, "44", 44));
        _listDT.add(new DienThoai("55", 55, "ip12 pro", 55));
        _listDT.add(new DienThoai("111", 111, "ip12", 111));
        _listDT.add(new DienThoai("222", 222, "22", 22));

        while (true) {
            System.out.println("======MENU=======");
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
            System.out.println("11. In ra điện thoại có tên IP12");
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
                case 3:
                    namSX();
                    break;
                case 4:
                    inDTTheoNam();
                    break;
                case 5: 
                    timTen();
                    break;
                case 6:
                    sxTheoGia();
                    break;
                case 9:
                    suaTTTheoTen();
                    break;
                case 11:
                    timTenIP();
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

    //Tìm ĐT theo tên
    public void timTen() {
        System.out.print("Nhập tên cần tìm: ");
        String ten = _sc.nextLine();
        for (DienThoai dienThoai : _listDT) {
            if (ten.equalsIgnoreCase(dienThoai.getTen())) {// Hoa=HOA
                System.out.println(dienThoai);
            }
        }
    }
     public void timTenIP() {
        System.out.print("Nhập tên cần tìm: ");
        String ten = _sc.nextLine();
        for (DienThoai dienThoai : _listDT) {
            if (dienThoai.getTen().contains(ten)) {// chứa hay ko, ko đổi vị trí tkiem đc
                System.out.println(dienThoai);
            }
        }
    }

    //Xoá ĐT theo hãng
    public void xoaDTHang() {
        System.out.print("Nhập hãng cần tìm: ");
        String nhapMa = _sc.nextLine();
        for (DienThoai xx : _listDT) {
            if (nhapMa.equals(xx.getHangSX())) {
                _listDT.remove(xx);// xóa 1 Object trong list
//                break;
            }
        }
    }

    //Sắp xếp ĐT theo giá
    public void sxTheoGia() {
        // với thuộc tính có KDL  -> compare
        Collections.sort(_listDT, (o1, o2) -> Double.compare(o2.getGia(), o1.getGia()));
        xuatTT();
    }

    public void sxTheoTen() {
        // với string -> compareTo
        Collections.sort(_listDT, (d1, d2) -> d1.getTen().compareTo(d2.getTen()));
        _listDT.forEach(x -> System.out.println(x));
    }

    public void sxHang() {
        Collections.sort(_listDT, (h1, h2) -> h1.getHangSX().compareTo(h2.getHangSX()));
    }
    //In ra năm của ĐT ở vị trí bất kỳ

    //Sửa thông tin ĐT
    public void suaTTTheoTen() {
        // cho nhập vào tên -> tìm -> đối tượng
        // vị trí của đtuong đấy -> sửa đc
        System.out.print("Nhập tên Điện thoại cần edit thông tin: ");
        String _tenEdit = _sc.nextLine();
        int count = 0;
        for (DienThoai xxx : _listDT) {
            if (_tenEdit.equalsIgnoreCase(xxx.getTen())) {
                System.out.print("Mời nhập tên ĐT mới: ");
                String _tenDT = _sc.nextLine();
                System.out.print("Mời nhập năm SX: ");
                int _namSX = Integer.parseInt(_sc.nextLine());
                System.out.print("Mời nhập hãng SX: ");
                String _hangSX = _sc.nextLine();
                System.out.print("Mời nhập giá: ");
                double _giaDT = Double.parseDouble(_sc.nextLine());
                
                _listDT.set(count, new DienThoai(_hangSX, _namSX, _tenDT, _giaDT));
                
                System.out.println("Cập nhật thành công");
                break;
            }
            count ++;
        }
    }
    //In ra top 3 theo giá

    //In ra ĐT trong khoảng năm
    public void inDTTheoNam() {
        System.out.println("In ra ĐT trong khoảng năm");
        System.out.print("Nhập năm min: ");
        int min = Integer.parseInt(_sc.nextLine());
        System.out.print("Nhập năm max: ");
        int max = Integer.parseInt(_sc.nextLine());
        for (DienThoai xx : _listDT) {
            if (xx.getNamSX() >= min && xx.getNamSX() <= max) {
                System.out.println(xx);
            }
        }
    }

    //In ra năm SX của tất cả ĐT
    public void namSX() {
        System.out.println("Năm SX của tất cả ĐT");
        for (DienThoai xx : _listDT) {
            System.out.println(xx.getNamSX());
        }
    }

    //
    public void nhapTT() {
        while (true) {
            System.out.print("Mời nhập năm SX: ");
            int _namSX = Integer.parseInt(_sc.nextLine());
            System.out.print("Mời nhập hãng SX: ");
            String _hangSX = _sc.nextLine();
            System.out.print("Mời nhập tên ĐT: ");
            String _ten = _sc.nextLine();
            System.out.print("Mời nhập giá: ");
            double _giaDT = Double.parseDouble(_sc.nextLine());

            DienThoai dt = new DienThoai(_hangSX, _namSX, _ten, _giaDT);
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
//        for (int i = 0; i < _listDT.size(); i++) {
//            System.out.println(_listDT.get(i));
//        }
        // foreach: in tất mảng từ đầu -> cuối
//        for(DienThoai xxx : _listDT){
//            System.out.println(xxx);
//        }
        //
        _listDT.forEach(x -> System.out.println(x));
    }
}
