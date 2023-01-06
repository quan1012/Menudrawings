package Vonglap.Thietkemenu;

import java.util.Scanner;

public class Menudrawing {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình Tam Gíac");
            System.out.println("2. Hình Vuông");
            System.out.println("3. Hình Chữ Nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ Hình Tam Gíac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ Hình Vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Vẽ Hình Chữ Nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
