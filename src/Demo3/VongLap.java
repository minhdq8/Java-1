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
public class VongLap {
    public static void main(String[] args) {
        //Tính trung bình cộng các số
        //chia hết cho 5 từ 27 đến 999
        int tong = 0, dem = 0;
        for(int i = 27; i <= 987; i++){
            if(i % 5 == 0){
                tong = tong + i;
                dem ++;
            }
        }
        System.out.println("TBC: " + (tong/dem));
        
    }
    
    public static void main1(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println("In số nhỏ hơn 5");
            i++;
        }
        
        do {            
            System.out.println("Do while");
        } while (i > 5);
        
        for(int j = 0; j < 5; j++){
            System.out.println("For loop");
        }
        
    }
}
