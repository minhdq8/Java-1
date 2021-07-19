/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.*;
/**
 *
 * @author minhdq
 */
public class DemoArray {

    static Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int [] tuoi = {12,34,64,23,23,12,11,1,4,64,84,342,63,243,1,3,73,3};
//        tuoi[0] = 20;
//        String hoTen[] = {"ok", "minh"};
//        System.out.println(hoTen[1]);
//        System.out.println(tuoi[0] * 2 + 10);
//        System.out.println("Size tuổi: " + tuoi.length);
//        System.out.println("Tuổi cuối cùng: " + tuoi[tuoi.length -1] );
        
        //b1 nhập size của mảng
        System.out.print("Mời nhập size của mảng: ");
        int _size = Integer.parseInt(_sc.nextLine());
        //b2 khai bái, khởi tạo mảng
        int _tuoi[] = new int[_size];
        String _hoTen[] = new String[_size];
        //b3 nhập từng phần tử cho mảng
        for (int i = 0; i < _tuoi.length; i++) {
            System.out.printf("Nhập tuổi thứ %d : ", i + 1);
            _tuoi[i] = Integer.parseInt(_sc.nextLine());
            System.out.printf("Nhập tên thứ %d : ", i + 1);
            _hoTen[i] = _sc.nextLine();
        }
        
        Arrays.sort(_tuoi);
        Arrays.sort(_hoTen);
        
        System.out.println(Arrays.toString(_hoTen));
        //b4 xuất mảng vừa nhập
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < _tuoi.length; i++) {
            System.out.println(_tuoi[i]);
        }
        

    }
}
