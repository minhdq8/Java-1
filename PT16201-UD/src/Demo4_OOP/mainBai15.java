/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4_OOP;

/**
 *
 * @author minhdq
 */
public class mainBai15 {

    public static void main(String[] args) {
        Laptop lt = new Laptop();
        int a = 10;
        lt.nhap();
        lt.xuat();
        //
        a = lt.version;
        
        Laptop lt1 = new Laptop(a);
        System.out.println(lt1);
//
//        Laptop lt2 = new Laptop("Chiếu pro", 2020, 23.54);

    }

}
