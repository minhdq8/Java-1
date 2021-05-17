/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import java.util.Scanner;





/**
 *
 * @author Minh
 */
public class demo52NhapXuatMang {
    static Scanner sc = new Scanner(System.in);
    static int size ;// biến toàn cục
    static int minh = 10;
    
    public static void main(String[] args) {
        
        // b1 nhập size cho mảng
        System.out.print("Mời nhập size mảng: ");
        size = Integer.parseInt(sc.nextLine());// ép từ chuỗi về integer
        // b2 khai báo mảng
        String [] name = new String[size];
        // b3 nhập từng phần tử của mảng
        System.out.println("Nhập phần tử của mảng: ");
        for(int i = 0; i < size; i++){
            System.out.printf("\tPhần tử thứ %d: " , i+1 );
            name[i] = sc.nextLine();
        }
        // b4 xuất mảng
        System.out.println("In ra mảng");
        for(int i = 0; i < name.length; i++){
        System.out.print (name[i] + "\t");
        }
        System.out.println("");

    }
    public static void test(){
        Scanner sc = new Scanner(System.in);
        System.out.println(minh);
        System.out.println(size);
    }
    public static void main000(String[] args) {

        // b1 nhập size cho mảng
        System.out.print("Mời nhập kích thức mảng tuổi: ");
        size = sc.nextInt();
        // b2 khai báo và khởi tạo
        int tuoi[] = new int[size];
        
        // b3 nhập vào từng phần tử của mảng
        System.out.println("Nhập từng phẩn tử mảng tuổi:");
        for(int i = 0; i< size; i++){
            System.out.printf("\tPhần tử tuoi[%d]: ", i);
            tuoi[i] = sc.nextInt();
        }
        // b4 xuất mảng tuổi
        System.out.print("Xuấy mảng tuổi vừa nhập: ");
        for(int i =0; i< tuoi.length; i++){
            System.out.print(tuoi[i] + " ");
        }
        System.out.println("");
    }

    public static void main00(String[] args) {
        // b1 nhập size cho mảng
        System.out.print("Mời nhập size của mảng:");
        size = sc.nextInt();
        // b2 khai báo và khởi tạo mảng
        int a[] = new int [size];
        
        // b3 nhập từng phần tử cho mảng
        System.out.println("Nhập phần tử: ");
        for(int i = 0; i < size; i++){
            System.out.printf("\tPhần tử thứ a[%d]: " , i);
            a[i] = sc.nextInt();
        }
        // xuất mảng
        System.out.println("Xuất mảng vừa nhập:");
        for(int i = 0; i < a.length; i++){
            
            System.out.print(a[i] + " . ");
        }
        System.out.println("");
        
    }
    public static void main01(String[] args) {
        // b1 khai báo số phần tử của mảng
        System.out.print("Nhập size mảng : ");
         size = sc.nextInt();
        
        // b2 khai báo và khởi tạo mảng
        int a[] = new int[size];
        
        // b3 nhập phần tử mảng
        System.out.println("Nhập phần tử : ");
        for(int i = 0;i < size;i++){
            System.out.printf("phần tử a[%d] = " , i);
            a[i] = sc.nextInt();
        }        
        // b4 xuất mảng
        System.out.println("Xuất mảng vừa nhập : ");
        for(int i = 0;i < size; i++){
            System.out.print(a[i]+"  ");
        }
        
    }
    public static void main05(String[] args) {
        // khai báo số ptu của mảng
        System.out.print("Nhập vào số phần tử của mảng: ");
        int size = sc.nextInt();
        
        // khởi tạo mảng
        int array[] = new int[size];
        
        // nhập từng phần tử mảng 
        System.out.println("Nhập phần tử của mảng : ");
        for(int i = 0; i < size; i++){
           array[i] = sc.nextInt();
        }
        // xuất mảng 
        for(int i = 0 ; i < array.length; i++){
            System.out.println( array[i]+" ");
        }
    }
    public static void main04(String[] args) {
        //1: nhập số phần tử của mảng
        System.out.print("Nhập vào size của mảng : ");
        int size = sc.nextInt();
        //2: khai báo và khởi tạo mảng
        int a[] = new int[size];
        //3 Nhập vào từng phần tử của mảng
        System.out.println("Nhập vào từng phần tử mảng : ");
        for(int i = 0;i < size; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        //4 xuất ra mảng ( xuất ra từng phần tử trong mảng)
        System.out.println("Mảng vừa nhập là : ");
        for(int i =0 ; i < size; i++){
            System.out.print(a[i]+ "  ");
        }
    }
    public static void main03(String[] args) {
        System.out.print("Nhập vào số phần tử mảng : ");
        int size = sc.nextInt();
       
        int [] array = new int[size];
        System.out.print("Nhập phần tử mảng : ");
        for( int i = 0; i < size; i++){
            System.out.printf("a[%d] = " , i);
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+ "  ");
        }
        
    }
    public static void main02(String[] args) {
        
        System.out.print("Nhập vào kích thước mảng :  ");
        int size = sc.nextInt(); // size là kích thước mảng
        
        int [] array = new int[size]; //khai báo và cấp phát bộ nhớ cho mảng
        
        System.out.println("Nhập vào phần tử của mảng :  ");
        for(int i = 0 ; i < size; i++){
            System.out.printf("array[%d] = " , i);
            array[i] = sc.nextInt();
        }
        // hiển thị mảng
        System.out.print("Mảng đã nhập là : ");
        for(int j = 0; j < size; j++){
            System.out.print(array[j] + "  ");
        }
        
        
    }
    public static void main07(String[] args) {
         System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // khởi tạo mảng a
        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        //xuatMang(a);       
        xuatMang12(a);

    }
    public static void xuatMang(int[] arr) {
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void xuatMang12(int[] arr) {        
        for (int i : arr) { // không cần phải tăng hay giảm giá trị của biến rồi check điều kiện
            System.out.print(i + "  ");
        }
    }
   
}
