/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoArrListOOP;

import java.util.*;

/**
 *
 * @author minhdq
 */
public class ThongTinNYXXX {

    Scanner sc = new Scanner(System.in);
    List<NguoiYeuXXX> listNYXXX = new ArrayList<>();

    public void menu() {
        listNYXXX.add(new NguoiYeuXXX("Hoa", 20, 89));
        listNYXXX.add(new NguoiYeuXXX("Heo", 21, 70));
        listNYXXX.add(new NguoiYeuXXX("Mai", 23, 90));
        listNYXXX.add(new NguoiYeuXXX("Dua", 10, 60));
        listNYXXX.add(new NguoiYeuXXX("Heo", 30, 70));
        listNYXXX.add(new NguoiYeuXXX("Heo lon ga", 20, 104));
        listNYXXX.add(new NguoiYeuXXX("Heo", 70, 70));

        while (true) {
            System.out.println("----------- MENU -----------");
            System.out.println("1. Nhập thông tin NYC");
            System.out.println("2. Xuất danh sách NYC");
            System.out.println("3. Tìm NYC theo tên");
            System.out.println("4. Tìm theo khoảng số đo vòng 3");
            System.out.println("5. Tìm tất cả NYC có chữ Đẹp trong tên");
            System.out.println("6. edit");
            System.out.println("7. Xoá");
            System.out.println("8. Sắp xếp NYC theo vòng mông");
            System.out.println("0. Kết thúc");
            System.out.println("----------------------------");
            System.out.print(">> Chọn chức năng: ...  ");
            int so = Integer.parseInt(sc.nextLine());
            System.out.printf("==> Bạn vừa chọn chức năng %d\n", so);

            switch (so) {
                case 1:
                    inPut();
                    break;
                case 2:
                    outPut();
                    break;
                case 3:
                    findName();
                    break;
                case 4:
                    findMong();
                    break;
                case 5:
                    findNameInclude();
                    break;
                case 6:
                    editVong3();
                    break;
                case 7:
                    remove();
                    break;
                case 8:
                    sortAge();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui lòng chọn số từ 1 đến 7!");
                    break;
            }
        }

    }

    public void inPut() {
        while (true) {
            System.out.print("Mời nhập tên: ");
            String ten = sc.nextLine();
            System.out.print("Mời nhập tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Mời nhập vòng 3: ");
            double vong3 = Double.parseDouble(sc.nextLine());

            NguoiYeuXXX nyc = new NguoiYeuXXX(ten, tuoi, vong3);
            listNYXXX.add(nyc);

            System.out.print("Nhập tiếp hay không? (YES/NO) ... ");
            if (sc.nextLine().equals("NO")) {
                break;
            }
        }

    }

    public void outPut() {
        for (NguoiYeuXXX x : listNYXXX) {
            System.out.println(x.toString());
        }
    }

    public void findName() {// tên nhập vào vs tên của đối tương có trong list
        System.out.print("Mời nhập tên NYC cần tìm: ");
        String nameXXX = sc.nextLine();

        for (NguoiYeuXXX x : listNYXXX) {
            if (x.getName().equalsIgnoreCase(nameXXX)) {
                System.out.println(x.toString());
            }
        }
    }

    public void findMong() {// tìm theo số đo vòng 3
        System.out.print("Nhập min vòng 3: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập max vòng 3: ");
        double max = Double.parseDouble(sc.nextLine());

        for (NguoiYeuXXX x : listNYXXX) {
            if (x.getVongMong() >= min && x.getVongMong() <= max) {
                System.out.println(x.toString());
            }
        }

    }

    public void findNameInclude() {// tên nhập vào vs tên của đối tương có trong list
        System.out.print("Mời nhập tên NYC cần tìm: ");
        String nameXXX = sc.nextLine();

        for (NguoiYeuXXX x : listNYXXX) {
            if (x.getName().contains(nameXXX)) {
                System.out.println(x.toString());
            }
        }
    }

    private void editVong3() {
        System.out.print("Mời nhập tên NYC cần sửa vòng 3: ");
        String nameXXX = sc.nextLine();

        for (NguoiYeuXXX x : listNYXXX) {
            if (x.getName().equalsIgnoreCase(nameXXX)) {
                System.out.print("Mời nhập vòng 3 hiện tại:  ");
                double vong3 = Double.parseDouble(sc.nextLine());
                x.setVongMong(vong3);
                break;
            }
        }
    }

    private void remove() {
        System.out.print("Mời nhập tên NYC cần xoá: ");
        String nameXXX = sc.nextLine();

        for (NguoiYeuXXX x : listNYXXX) {
            if (x.getName().equalsIgnoreCase(nameXXX)) {
                listNYXXX.remove(x);
                break;
            }
        }
    }

    public void sortAge() {

        Collections.sort(listNYXXX, new Comparator<NguoiYeuXXX>() {
            @Override
            public int compare(NguoiYeuXXX o1, NguoiYeuXXX o2) {
                return o1.getAge() > o2.getAge() ? 1 :  -1;
            }
        });
        for(NguoiYeuXXX xxx : listNYXXX){
            System.out.println(xxx.toString());
        }
    }
    public void sortVong3() {

        Collections.sort(listNYXXX, new Comparator<NguoiYeuXXX>() {
            @Override
            public int compare(NguoiYeuXXX o1, NguoiYeuXXX o2) {
                return o2.getVongMong()> o1.getVongMong() ? 1 : -1;
            }
        });
        for(NguoiYeuXXX xxx : listNYXXX){
            System.out.println(xxx.toString());
        }
    }
    public void sortName() {

        Collections.sort(listNYXXX, new Comparator<NguoiYeuXXX>() {
            @Override
            public int compare(NguoiYeuXXX o1, NguoiYeuXXX o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(NguoiYeuXXX xxx : listNYXXX){
            System.out.println(xxx.toString());
        }
    }
    
    
}
