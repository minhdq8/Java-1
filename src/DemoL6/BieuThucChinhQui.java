/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoL6;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class BieuThucChinhQui {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String sdt = "0\\d{9}";
        System.out.print("Mời nhập SDT: ");
        String mobile = sc.nextLine();
        if(mobile.matches(sdt)){
            System.out.println("Đúng là SĐT rồi");
        }else{
            System.out.println("nhập sai SĐT");
        }
    }
    
    public static void main01(String[] args) {
        
        String user = "Minh";
        String pass = "java";
//        String sdt = "0\\d{9}";
//        String email = "\\w+@\\w+(\\. \\w+){1,2}";
        
        System.out.print("Mời nhập user: ");
        String userName = sc.nextLine();
        System.out.print("Mời nhập password: ");
        String passWord = sc.nextLine();
        
        if(user.equalsIgnoreCase(userName)&&
                pass.equals(passWord)){
            System.out.println("Login thành công");
        }else{
            System.out.println("Sai rồi thánh ơi!");
        }
        
    }
}
