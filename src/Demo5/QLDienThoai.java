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
        while(true){
        _listDT.add(new DienThoai("333", 333, "333"));
        _listDT.add(new DienThoai("444", 444, "444"));
        _listDT.add(new DienThoai("555", 555, "555"));
        _listDT.add(new DienThoai("111", 111, "111"));
        _listDT.add(new DienThoai("222", 222, "222"));

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
    public void timTen(){
        System.out.print("Nhập tên cần tìm: ");
        String ten = _sc.nextLine();
        for (DienThoai dienThoai : _listDT) {
            if(dienThoai.getTen().equalsIgnoreCase(ten)){// Hoa=HOA
                System.out.println(dienThoai);
            }
        }
    }
    //Xoá ĐT theo hãng
    //Sắp xếp ĐT theo giá
//      In ra năm của ĐT ở vị trí bất kỳ
//       Sửa thông tin ĐT
    
//        In ra top 3 theo giá
    //In ra ĐT trong khoảng năm
    public void inDTTheoNam(){
        System.out.println("In ra ĐT trong khoảng năm");
        System.out.print("Nhập năm min: ");
        int min = Integer.parseInt(_sc.nextLine());
        System.out.print("Nhập năm max: ");
        int max = Integer.parseInt(_sc.nextLine());
        for(DienThoai xx : _listDT){
            if(xx.getNamSX() >= min && xx.getNamSX() <= max){
                System.out.println(xx);
            }
        }
    }
    //In ra năm SX của tất cả ĐT
    public void namSX(){
        System.out.println("Năm SX của tất cả ĐT");
        for(DienThoai xx : _listDT){
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
//        for (int i = 0; i < _listDT.size(); i++) {
//            System.out.println(_listDT.get(i));
//        }
        // foreach: in tất mảng từ đầu -> cuối
        for(DienThoai xxx : _listDT){
            System.out.println(xxx);
        }
    }
}
