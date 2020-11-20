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
public class Demo_VongLap {

    public static void main(String[] args) {
        TBC(27, 1334, 5);
        
    }

    public static double TBC(int a, int b, int c) {
        int sum = 0, count = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                sum += i;
                count++;
            }
        }
        return sum/count;
    }
}
