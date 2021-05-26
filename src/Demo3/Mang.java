/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //b1 nhập kích thước cho mảng
        System.out.print("Mời nhập size của mảng: " );
        int size = Integer.parseInt(sc.nextLine());
        // b2 khai báo vs khởi tạo mảng
        double _canNang[] = new double[size];
        // b3 nhập từng phẩn tử cho mảng
        for (int i = 0; i < _canNang.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ",(i + 1));
            _canNang[i] = Double.parseDouble(sc.nextLine());
        }
        // b4 xuất mảng
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0; i < _canNang.length; i++){
            System.out.println(_canNang[i]);
        }
        Arrays.sort(_canNang);// sắp xếp từ bé -> lớn
        System.out.println(Arrays.toString(_canNang));
    }

    public static void main01(String[] args) {
        int _tuoi[] = new int[4];
        String[] _hoTen;

        double _diem[] = {9.4, 9.3, 2, 5, 5.4};

//        System.out.println(_diem[0]);
//        System.out.println(_diem[1]);
//        System.out.println(_diem[2]);
        for (int i = 0; i < _diem.length; i++) {
            System.out.println(_diem[i]);

        }
        System.out.println("Độ dài mảng: " + _diem.length);

//        _tuoi[5] = 10;
//        System.out.println(_tuoi[5]);
    }

}
