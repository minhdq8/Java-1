/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Demo_Mang {
    static int a1[] = {1,3,5,7,9,34,342,1,5,757,4};
    static int b1[] = new int[3];
    static Scanner sc = new Scanner ( System.in);
    
    public static void main(String[] args) {
        // khai báo và khởi tạo mảng
        int [] a, b[], c,d;
        String hoTen[] = new String[10];
//        System.out.print("Độ dài mảng: ");
//        System.out.println(a1.length);
        nhapMang();
        duyetMang();
        
    }
    // in ra mảng
    public static void duyetMang(){
        for(int i = 0; i < b1.length; i++){
             System.out.print(b1[i]+",");
        }
    }
    // nhập vào giá trị cho mảng
    public static void nhapMang(){
        System.out.println("Nhập phần tử cho mảng : ");
        for(int i = 0; i < b1.length; i++){
            System.out.printf("Phần tử %d: ", (i+1));
            b1[i] = sc.nextInt();
        }
    }
}
