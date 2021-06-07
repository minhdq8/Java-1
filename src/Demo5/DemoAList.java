/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

import java.util.ArrayList;

/**
 *
 * @author minhdq
 */
public class DemoAList {

    public static void main(String[] args) {

        ArrayList<Object> a = new ArrayList();// không định kiểu
        a.add("Cường");
        a.add(true);
        a.add(1);
        a.add(2.5);
        a.add(10);// thêm vào cuối cùng list
//        a.add(0, 2021);//thêm 1 phẩn tử vào vị trí 1
        

        Integer x = (Integer) a.get(2);
        String xx = (String)a.get(0);
//        System.out.println(x);
//        // có định kiểu
        ArrayList<String> b = new ArrayList<>();
        b.add("");
        b.add("Chuỗi");
        ArrayList<Integer> soNguyen = new ArrayList<>();
        soNguyen.add(12);
        soNguyen.add(6787);
        soNguyen.add(232);
//
//        // xuất list
        for(int i = 0; i < soNguyen.size(); i ++){
            System.out.println(soNguyen.get(i));
        }

    }
}
