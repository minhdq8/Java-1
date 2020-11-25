/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

/**
 *
 * @author minhdq
 */
public class Demo3_1 {
//    static int i = 1;

    public static void main(String[] args) {
        System.out.println(TBC(27, 234));
    }

    public static double TBC(int a, int b) {
        double tong = 0;
        int dem = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                tong += i;
                dem++;
            }
        }
        return tong / dem;
    }

}
