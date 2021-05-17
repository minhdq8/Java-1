/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Demo5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        khoiTaoMang();
        nhapXuatMang();
    }

    static void khoiTaoMang() {

        int tuoi[] = {30, 20, 18, 4, 1};
        //0    1   2  3   4 index(chỉ số)
        String[] name = {"Phải", "dạy", "online", "vui vẻ"};
        System.out.println(tuoi[3]);
        tuoi[0] = tuoi[2] * 2;
        System.out.println(tuoi[0]);
        System.out.println(name[3]);

        System.out.println(tuoi.length);
        System.out.println(name.length);

        System.out.println("Xuất mảng tuổi: ");
        for (int i = 0; i < tuoi.length; i++) {
            System.out.print(tuoi[i] + "  ");
        }
        System.out.println("");

//        String [] name = {"Minh", "java", "poly", "tiền"};
//        int [] a = {1,4,6,7,8};// khai báo mảng a 
//                  //0 1 2 3 4
//        // size 5
//        System.out.println("a[2] = "+ a[2]);
//        a[2] = a[3] * 2;
//        System.out.println("a[2] = "+ a[2]);
//        // 1 4 14 7 8
//        System.out.println("Độ dài/số phần tử của mảng: "+ a.length);
//        
//        System.out.println("Vị trí thứ 3 là: " + name[2]);
//        System.out.println("Độ dài của mảng/ kích thức của mang: " + name.length);
//   
//        // In ra mảng
//        System.out.print("Các phần tử trong mảng là:");
//        for(int i = 0; i < a.length; i++ ){
//            System.out.print ("  "+ a[i]);
//        }
//        System.out.print ("  "+ Arrays.toString(a));
//        System.out.println("");
    }

    static void nhapXuatMang() {
        int tong = 0;
        // B1 Nhập size cho mảng
        System.out.print("Mời nhập size của mảng: ");
        int size = sc.nextInt();
        // B2 khai báo và khởi tạo mảng
        int a[] = new int[size];
        // B3 nhập giá trị vào từng phần tử trong mảng
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Mời nhập phần tử thứ %d: ", (i + 1));
            a[i] = sc.nextInt();
            tong += a[i];
        }
        // B4 xuất mảng
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < size ; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
        // tính TBC 
        System.out.println("TBC = " + tong/size);
        System.out.print("Mảng lập phương là: ");
        for (int i = 0; i < size ; i++) {
            System.out.print(" " + Math.pow(a[i], 3));
        }
        // mảng nâng cao
        System.out.println("");
        System.out.println("Mảng đẹp đẽ: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sau khi sort: " + Arrays.toString(a));
    }
}
