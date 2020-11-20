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
public class Demo_Mang {

    static Scanner sc = new Scanner(System.in);
//    static int[] b = {1, 3, 5, 7, 3, 2};
    static int size;
    
    public static void main(String[] args) {
        // khai báo 1 mảng a có KDL là int 
        // mảng này chưa tối đa 5 ptu
        int[] a = new int[5];
        
        //b1 nhập kích thước cho mảng
        System.out.print("Nhập kích thước mảng: ");
        size = sc.nextInt();
        sc.nextLine();
        //b2 khai báo và khởi tạo mảng
        int[] b = new int[size];
        //b3 nhập vào giá trị cho từng phần tử trong mảng
        nhapMang(b);
        //b4 xuất mảng vừa nhập
        xuatMang(b);
        
       // sắp xếp trong mảng
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b, 3));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        
    }
    public static void nhapMang(int []a) {
        // nhập mảng
        for (int i = 0; i < size; i++) {
            System.out.printf("Phần tử thứ %d: ", (i + 1));
            a[i] = Integer.parseInt(sc.nextLine());
        }
    }
    public static void xuatMang(int []a) {
        // duyệt mảng/ in ra mảng
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public static void xuatMang(){
        
    }
    public static void xuatMang(int a, int b){
        
    }
    public static void xuatMang(int a, double b){
        
    }
}
