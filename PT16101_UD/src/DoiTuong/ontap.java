/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author minhdq
 */
public class ontap {
    public static void main(String[] args) {
        int a = 2, b =4;// ko cố đinh, lấy đâu đó, nhập ...
        double c = 23.44;
        String ten = "chán đời";
        // tham số truyền vào
        // 1. kiểu dữ liệu truyền vào
        // 2. thứ tự tham số truyền vào
//        tinhTong(a, ten);
        
        // kiểu dữ liệu trả về
        tinhTong();
    }
    // có KDL trả về nhưng ko có tham số 
    public static int tinhTong(){
        int a = 10, b = 15;// nhập từ bàn phím
        double c = 29.3;
        return a + b;
    }
    // có KDL trả về và có thàm số
    public static String tenTuoi(String name){
        return name;
    }
//    public static void tinhTong(){
//        int a = 10, b = 15;// nhập từ bàn phím
//        System.out.println(a+b);
//    }
    // ko có KDL nhưng có tham số truyền vào
    public static void tinhTong(int a, int b){
        System.out.println(a+b);
    }
    // ko có KDL và cũng ko có tham số
    public static void tinhTong2(){

    }
    
}
