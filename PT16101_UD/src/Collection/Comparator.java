/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class Comparator {

    public static void main(String args[]) {

        List<Student> listSV = new ArrayList<>();
        listSV.add(new Student(101, "Đ Khánh An", 23));
        listSV.add(new Student(34.3, "Ăn ức", 29));
        listSV.add(new Student(34.2, "Bình", 21));
        listSV.add(new Student(105.4, "Áinh", 25));
        listSV.add(new Student(190.4, "Sáng", 53));
        listSV.add(new Student(199, "Ớối", 90));
        listSV.add(new Student(199, "Êối", 90));
        listSV.add(new Student(199, "Àối", 90));

        System.out.println("Sort by Age");
        listSV.sort((Student o1, Student o2) -> o2.getStudentage() - o1.getStudentage());
        //java 8 only, lambda also, to print the List
        listSV.forEach((x) -> {
            System.out.println(x.toString());
        }
        );
        System.out.println("\nSort by RollNumber");
        // 34.4 - 32 .0 = 2.4 -> 2 so sáh 0 -> lớn o -> o1 > o2 -> đổi 
        listSV.sort((Student o1, Student o2) -> (int)(o1.getRollno() - o2.getRollno()));
        listSV.forEach((x) -> System.out.println(x));
////
        System.out.println("\nSort by Name");
        listSV.sort((Student o1, Student o2) -> o1.getStudentname().compareTo(o2.getStudentname()));
        listSV.forEach((x) -> System.out.println(x));
    }
}
