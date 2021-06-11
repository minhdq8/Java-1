/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoL6;

/**
 *
 * @author minhdq
 */
public class TryCatch {
    public static void main(String[] args) {
        try {
            int []a = {5,6,7};
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("Index ko tồn tại");
        }
    }
}
