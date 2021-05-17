/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4_OOP;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Laptop {

    // thuộc tính
    private String brand;
    public int version;
    protected double price;

    // phương thức
    //constructor(hàm tạo, pthuc khởi tạo)
    //-> tạo đối tượng
    public Laptop() {
    }

    public Laptop(String brand, int version, double price) {
        this.brand = brand;
        this.version = version;
        this.price = price;
    }

    public Laptop(double price) {
        this.price = price;// = 10.23
    }
    public Laptop(int version) {
        this.version = version;// = 10.23
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng: ");
        brand = sc.nextLine();
        System.out.print("Nhập version: ");
        version = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá: ");
        price = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println(brand + "," + version + "," + price);
    }

    public String xepLoai() {
        if(version >= 2018 ){
            return "Chiếu mới chưa từng trải";
        } else {
            return "Chiếu rách";
        }
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + brand + ", version=" + version + ", price=" + price + '}';
    }
    

}
