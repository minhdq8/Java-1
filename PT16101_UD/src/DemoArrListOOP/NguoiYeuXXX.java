/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoArrListOOP;

/**
 *
 * @author minhdq
 */
public class NguoiYeuXXX {

    private String name;
    private int age;
    private double vongMong;

    public NguoiYeuXXX(String name, int age, double vongMong) {
        this.name = name;
        this.age = age;
        this.vongMong = vongMong;
    }

    @Override
    public String toString() {
        return "NguoiYeuXXX{" + "name=" + name + ", age=" + age + ", vongMong=" + vongMong + '}';
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getVongMong() {
        return vongMong;
    }

    public void setVongMong(double vongMong) {
        this.vongMong = vongMong;
    }

}
