package vn.plusplus.javacore.lesson4;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        for(int j = 0; j< 2; j++) {
            System.out.println("Thực hiện lần tính toán thứ "+ (j+1));
            int i, sum = 0;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Nhập vào số:");
                i = scanner.nextInt();
                /*
                 * Nếu số nhập < 0 thì sẽ kết thúc vòng lặp
                 * và thực hiện câu lệnh bên ngoài vòng lặp.
                 */
                if (i < 0) {
                    break;
                }

                sum += i;
            } while (i >= 0);    // i còn lớn hơn hoặc bằng 0 thì còn tiếp tục
            System.out.println("Kết quả = " + sum);
        }
    }
}
