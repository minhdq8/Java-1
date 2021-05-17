/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class QLLapTop {

    Scanner sc = new Scanner(System.in);
    ArrayList<LapTop> listLT = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("1. Nhập danh sách LT");
            System.out.println("2. Xuất danh sách ");
            System.out.println("0. Kết thúc");

            System.out.print(">> Chọn chức năng: ...  ");
            int so = Integer.parseInt(sc.nextLine());
            System.out.println("======================");

            switch (so) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn số từ 0 đến 6!");
                    break;
            }
        }
    }

    public void nhap() {
        while (true) {
            System.out.print("Nhập hãng :");
            String hangSX = sc.nextLine();
            System.out.print("Nhập năm :");
            int namSX = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập màu :");
            String mauSac = sc.nextLine();

            LapTop lt = new LapTop(hangSX, namSX, mauSac);
            listLT.add(lt);

            System.out.print("Tiếp hay ko ? (Y/N)");
            if (sc.nextLine().equals("N")) {
                break;
            }

        }
    }

    public void xuat() {
        for(LapTop xxx : listLT){
            System.out.println(xxx);
        }
    }
}
