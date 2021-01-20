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
public class Mang {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //b1 nhập size cho mảng
        System.out.print("Mời nhập size: ");
        int size = Integer.parseInt(sc.nextLine());
        //b2 khai báo và khởi tạo mảng
        int a[] = new int[size];
        // b3 nhập giá trị cho mảng
        System.out.println("Nhập giá trị cho mảng");
        for(int i = 0; i < size; i++ ){
            System.out.printf("Phần tử thứ %d:", i+1 );
            a[i] = Integer.parseInt(sc.nextLine());
        }
        // b4 xuất
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        
        
    }
}
