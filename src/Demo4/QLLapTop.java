/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

/**
 *
 * @author minhdq
 */
public class QLLapTop {
     public static void main(String[] args) {
        LapTop lt = new LapTop("macbook", 2021, 2000);
        System.out.println(lt.toString());

        LapTop lt2 = new LapTop(2016);
        lt2.setNamSX(2020);
        
        System.out.println(lt2.toString());
    }
}
