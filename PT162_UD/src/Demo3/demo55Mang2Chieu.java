/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

/**
 *
 * @author Minh
 */
public class demo55Mang2Chieu {
    public static void main(String[] args) {
        // khai báo và khởi tạo
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // xuất mảng 2 chiều
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){ 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
