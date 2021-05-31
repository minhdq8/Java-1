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
public class bai16 {

    public static void main(String[] args) {
//        16. Nhập vào tên và tuổi của cả gia đình
//      -> in ra tên tuổi của cả nhà
//      -> in ra thông tin của ng cao tuổi nhất

        Scanner sc = new Scanner(System.in);
        //b1 nhập kích thước cho mảng
        System.out.print("Mời nhập số thành viên gđ: ");
        int size = Integer.parseInt(sc.nextLine());
        // b2 khai báo vs khởi tạo mảng
        String _hoTen[] = new String[size];
        int _tuoi[] = new int[size];

        // b3 nhập từng phẩn tử cho mảng
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập tên người thứ %d: ", (i + 1));
            _hoTen[i] = sc.nextLine();
            System.out.printf("Nhập tuổi người thứ %d: ", (i + 1));
            _tuoi[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Tên cả nhà: ");
        System.out.println(Arrays.toString(_tuoi));
        System.out.println(Arrays.toString(_hoTen));
        
//        for (int i = 0; i < size; i++) {
//            System.out.println("Tên " + _hoTen[i] + _tuoi[i] + " tuổi");
//        }
        
        Arrays.sort(_tuoi);// sắp xếp từ bé -> lớn
        System.out.println(Arrays.toString(_tuoi));
        
//        for (int i = 0; i < size; i++) {
//            System.out.println("Tên " + _hoTen[i] + _tuoi[i] + " tuổi");
//        }
//        System.out.println(_tuoi[size -1]);
//        Arrays.sort(_hoTen);
//        System.out.println(_hoTen[size - 1]);
    }
}
