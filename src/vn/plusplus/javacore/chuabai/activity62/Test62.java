package vn.plusplus.javacore.chuabai.activity62;

import java.util.Scanner;

public class Test62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so SV: ");
        int n = scanner.nextInt();

        StudentManagement studentManagement = new StudentManagement(n);

        System.out.println("Tong so sinh vien DO: " + studentManagement.countDo());
        System.out.println("Tong so sinh vien TRUOT: " + studentManagement.countTruot());
    }
}
