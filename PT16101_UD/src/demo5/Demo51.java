/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

/**
 *
 * @author Minh
 */
public class Demo51 {
    public static void main(String[] args) {
        
        int a[] = { 33, 3, 4, 5 };
        min(a);// truyền mảng tới phương thức
  
    }
    static void min(int arr[]) {
        //Chúng ta có thể truyền mảng vào phương thức,
        //điều này giúp tái sử dụng code logic để xử lý mảng bất kỳ. 
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

}
