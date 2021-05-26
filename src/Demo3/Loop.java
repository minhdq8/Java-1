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
public class Loop {
    public static void main(String[] args) {
        
//        14. Tính trung bình cộng các số chia hết 
//                cho 5 từ 27 đến 999.
    int tong = 0;
    int dem = 0;
        for(int i = 27; i < 31; i++){
            if(i % 5 == 0){
                tong = tong + i;
                dem ++;
            }
        }
        System.out.println(tong/dem);
                
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 9; j++){
//                System.out.printf("%d x %d = %d \t",j,i,i * j);
//            }
//            System.out.println();
//        }
    }
    public static void main01(String[] args) {
        int tuoi = 1;
        while(tuoi < 2){
            System.out.println("teen");
            tuoi ++;
        }
        tuoi = 1;
        do {            
            System.out.println("in 1 lần");
            tuoi++;
        } while (tuoi < 1);
        
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}
