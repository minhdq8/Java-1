/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt162_ud;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class PT162_UD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Nhập tên:
            Nhập số đo vòng 3:
            Nhập dáng: 
            Nhập chiều cao: 
         */
        // khai báo
        Scanner sc = new Scanner(System.in);

        String hoTen, dangNguoi;
        double soDo3, chieuCao;

        // nhập thông tin
        System.out.print("Mời nhập tên NYC: ");
        hoTen = sc.nextLine();
        
        System.out.print("Mời nhập số đo vòng 3: ");
        String a = sc.nextLine();
        soDo3 = Double.parseDouble(a);
//        soDo3 = sc.nextDouble();
//        sc.nextLine();
        System.out.print("Mời nhập dáng NYC: ");
        dangNguoi = sc.nextLine();
        
        System.out.print("Mời nhập chiều cao: ");
        chieuCao = sc.nextDouble();
        
        double soSanh = Math.max(soDo3, chieuCao);
        System.out.println(Math.max(soDo3, chieuCao));
        

    }

}
