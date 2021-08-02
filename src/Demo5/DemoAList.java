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

        ArrayList<Object> a = new ArrayList<>();// không định kiểu
        a.add("Cường");
        a.add(true);
        a.add(1); // int -> Int(eger
        a.add(2.5);// Double
        a.add(10);
        a.add("OK baby");// thêm vào cuối cùng list
        a.add(0, "cô với chả vít");//thêm 1 phẩn tử vào vị trí 0
        
        System.out.println(a.toString());

        Integer x = (Integer) a.get(3);// khác (int) 2.5
//        String xx = (String)a.get(0);
        System.out.println(x);
////        // có định kiểu
        ArrayList<String> b = new ArrayList<>();
        b.add("");
        b.add("Chuỗi");
        b.add("2323");
        // double = Double 
        ArrayList<Integer> soNguyen = new ArrayList<>();
        soNguyen.add(12);
        soNguyen.add(6787);
        soNguyen.add(232);
        soNguyen.add(232);
        soNguyen.add(232);
////
////        // xuất list
        for(int i = 0; i < soNguyen.size(); i ++){
            System.out.println(soNguyen.get(i));
        }

    }
}
