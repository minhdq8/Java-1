/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

/**
 *
 * @author minhdq
 */
public class Mang2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // nhập size của mảng
        System.out.print("Nhập size: ");
        int size = sc.nextInt();
        // khai báo và khởi tạo mảng
        int b [] = new int[size];
        // nhập vào mảng
        for(int i = 0; i < size; i++){
            System.out.printf("hần tử thứ %d: ", i+1);
            b[i] = sc.nextInt();
        }
        // xuất
        System.out.print("Mảng vừa gõ: ");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }

//        int a [] = {1 ,2 ,3 , 6};
//        System.out.println(a.length);
    }
}
