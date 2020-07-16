/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

/**
 *
 * @author Minh
 */
import java.util.Arrays;
import java.util.Scanner;

public class demoSapXepMang {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập kích thước mảng :  ");
        int size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Nhập phần tử mảng :  ");
        for (int i = 0; i < size; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng gốc là : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + "  ");// in các phần tử trên cùng 1 dòng            
        }
        System.out.println("");
        System.out.println("Lớn hơn 50");
        for (int i = 0; i < size; i++) {
            if (a[i] > 50) {
                System.out.println(a[i]);
            }
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
       
        System.out.println("\nMảng sau khi sắp xếp : ");
        int temp;
        // sắp xếp các phần tử trong mảng
        // vòng lặp for sẽ duyệt i và j
        // i chạy từ 0 đến n - 2, j chay từ i + 1 đến n - 1
        // nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
        // thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//        for(int i = 0; i < size ; i++){
//            System.out.print(a[i]+ "  ");            
//        }
    }
}
