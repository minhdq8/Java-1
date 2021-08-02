/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author minhdq
 */
public class SapXep {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Minh");
        list1.add("áAA");
        list1.add("bFFF");
        list1.add("mac");
        list1.add("123Mac");
        Collections.sort(list1);
        for(String a : list1){
            System.out.println(a);
        }
        System.out.println("============");
        
        Collections.reverse(list1);// đảo ngược
        for(String a : list1){
            System.out.println(a);
        }
        
        System.out.println("============");
        Collections.sort(list1, new Comparator<String>(){
            @Override
            public int compare(String n1, String n2){
                return n2.compareTo(n1);
            }
        });
        for(String a : list1){
            System.out.println(a);
        }

    }
}
