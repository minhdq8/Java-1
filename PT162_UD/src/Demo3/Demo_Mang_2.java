/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import static Demo3.Demo_Mang.b1;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Demo_Mang_2 {
        static int size = 0 ;
//        static int a[]= new int[size];
        static Scanner sc = new Scanner ( System.in);
    public static void main(String[] args) {
        // Nhập size cho mảng
        System.out.print("Nhập vào size: ");
        size = sc.nextInt();
        // khai báo & khởi tạo mảng
        int a[] = new int[size];
        // nhập vào mảng
        nhapMang(a);
        // xuất ra mảng
        duyetMang(a);
    }
    
    
    
        // in ra mảng
    public static void duyetMang(int []a){
        for(int i = 0; i < a.length; i++){
             System.out.print(a[i]+",");
        }
    }
    // nhập vào giá trị cho mảng
    public static void nhapMang(int []a){
        System.out.println("Nhập phần tử cho mảng : ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("Phần tử %d: ", (i+1));
            a[i] = sc.nextInt();
        }
    }
}
