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
public class Demo_Mang_10 {

    static int size = 0;
//        static int a[]= new int[size];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Nhập size cho mảng
        System.out.print("Nhập vào size: ");
        size = Integer.parseInt(sc.nextLine());
        // khai báo & khởi tạo mảng
        double a[] = new double[size];
        String name[] = new String[size];
        // nhập vào mảng
        nhapMang(a,name);
        // xuất ra mảng
        duyetMang(a,name);
        // info cân nặng lớn nhất
        double max = a[0];
        int viTri = 0;
        for(int i = 1; i < size; i++){
            if(max < a[i]){
                max = a[i];
                viTri = i;
            }
        }
        System.out.println(a[viTri] + name[viTri]);
        
        // cân nặng lớn hơn 50kg
//        System.out.println("Cân nặng lớn hơn 50kg: ");
//        for(int i = 0; i < size; i++){
//           if(a[i] >= 50 ){
//               System.out.println(a[i]);
//           }
//        }
    }
    /*
    -> in ra cân nặng lớn hơn 50 kg
    -> in ra những cân nặng chia hết cho 2
    -> in ra cân nặng lớn nhất
     */
    

    // in ra mảng
    public static void duyetMang(double[] a, String name []) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Phần tử thứ %d ", i+1);
            System.out.print("Cân nặng: "+ a[i] +"và tên là "+ name[i] +"\n");
        }
    }

    // nhập vào giá trị cho mảng
    public static void nhapMang(double[] a, String []name) {
        System.out.println("Nhập phần tử cho mảng : ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Cân nặng %d: ", (i + 1));
            a[i] = Double.parseDouble(sc.nextLine());
            System.out.printf("Tên %d: ", (i + 1));
            name[i] = sc.nextLine();
        }
    }
}
