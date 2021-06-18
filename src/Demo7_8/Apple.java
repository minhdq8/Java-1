/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo7_8;

/**
 *
 * @author minhdq
 */
public class Apple extends DienThoai{
    String cam3Lo;
    String name;

    public Apple() {
    }

    public Apple(String cam3Lo, String name) {
        this.cam3Lo = cam3Lo;
        this.name = name;
    }

    public Apple(String cam3Lo, String name, String hangSX, int namSX, String mauSac, double kichCo) {
        super(hangSX, namSX, mauSac, kichCo);
        this.cam3Lo = cam3Lo;
        this.name = name;
    }
    
    public static void main(String[] args) {
        Apple tao = new Apple();
        tao.hangSX = "táo cắn nguyên";
        
    }
}

