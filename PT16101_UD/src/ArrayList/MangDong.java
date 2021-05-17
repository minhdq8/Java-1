/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

public class MangDong {

    public static void main(String[] args) {

        // không định kiểu
        ArrayList<Object> listBua = new ArrayList();
        listBua.add("Ngọc trinh");
        listBua.add(322);
        listBua.add(242.424);
        for(Object x : listBua){
            System.out.println(x);
        }
        for (int i = 0; i < listBua.size(); i++) {
            System.out.println(listBua.get(i));
        }

        // có định kiểu
        ArrayList<String> list1 = new ArrayList();
        list1.add("gì đây");
        list1.add("lếu mèo");
        
        list1.forEach(xx -> System.out.println(xx));
        
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // kiểu đối tượng
        SinhVien sv1 = new SinhVien(9);
        SinhVien sv2 = new SinhVien("lếu", 19, 29.3);
        SinhVien sv3 = new SinhVien("lều", 29, 20);
        ArrayList<SinhVien> listSV = new ArrayList();
        listSV.add(sv1);
        listSV.add(sv2);
        listSV.add(sv3);
        for(SinhVien xxx : listSV){
            System.out.println(xxx);
        }
        for(int i = 0; i < listSV.size(); i++){
            System.out.println(listSV.get(i));
        }

    }
}
