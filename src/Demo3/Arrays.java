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
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // b1 nhập kích thước cho mảng
        System.out.print("Nhập size cho mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        // b2 khai báo và khởi tạo mảng
        int tuoi[] = new int[size];
        // b3 nhập giá trị cho từng phần tử trong mảng
        for (int i = 0; i < tuoi.length; i++) {
            System.out.printf("Người thứ %d: ", i + 1);
            tuoi[i] = Integer.parseInt(sc.nextLine());
        }
        // b4 xuất mảng
        System.out.println("Xuất mảng vừa nhập");
        for(int i = 0; i < tuoi.length; i++){
            System.out.print(tuoi[i] + "\t");
        }
    }

    public static void main01(String[] args) {

        int tuoi[];
        double[] canNang;
        String ten[] = new String[3];

        double diem[] = new double[]{2, 3, 4.5, 7, 9.34};

        double chieuCao[] = {2.3, 6.4, 5, 9, 2, 32, 4, 2, 2, 24, 24, 63};

        System.out.println(chieuCao[0]);
        chieuCao[0] = chieuCao[2] * 5;
        System.out.println(chieuCao[0]);
        int size = chieuCao.length;// kích thước mảng
        System.out.println("Size: " + size);
        System.out.println(chieuCao[chieuCao.length - 1]);

    }
}
