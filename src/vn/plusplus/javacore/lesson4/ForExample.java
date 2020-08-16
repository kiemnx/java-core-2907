package vn.plusplus.javacore.lesson4;

public class ForExample {
    public static void main(String[] args) {
//        int a = 5;
        for(int i = 0, a = 5; i < a; i = i + 1){
            System.out.println("Hello " + i);
        }
        System.out.println("Ket thuc");

        int b = 5;
        while (b < 5){
            System.out.println("Hello " + b);
            // Do your code
            b = b + 1;
        }
        System.out.println("Ket thuc");


        int c = 5;
        do{
            System.out.println("Hello " + c);
            c = c + 1;
        } while (c < 5);
    }
}
