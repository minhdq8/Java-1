/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> soThucList = new ArrayList<>();
        // nhập vào số thực
        while (true) {
            System.out.print("Mời thánh nhập số thực: ");
            double soThuc = Double.parseDouble(sc.nextLine());
            soThucList.add(soThuc);

            System.out.print("Sống hay chết ? (Y/N)");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        // tính tổng
        for(Double xxx : soThucList){
            System.out.println(xxx);
        }
        // xuất ra
    }
}
