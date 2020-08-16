package vn.plusplus.javacore.lesson4;

public class ConditionExample {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        float gpa = 3.2f;

        if(gpa >= 3.2f && gpa <3.6f){
            System.out.println("SV loai gioi");
        }
        if(gpa < 2.5f && gpa >=0){
            System.out.println("SV trung binh");
        }
        if(gpa >=2.5f && gpa < 3.2f) {
            System.out.println("SV loai kha");
        }
        if(gpa >= 3.6){
            System.out.println("SV loai xuat sac");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Thoi gian chay ctrinh: " + (endTime - startTime) + " nano seconds");


        if(gpa >= 3.2f && gpa <3.6f){

            System.out.println("SV loai gioi");

        } else if(gpa >=2.5f && gpa < 3.2f){

            System.out.println("SV loai kha");

        } else if(gpa < 2.5f && gpa >=0){

            System.out.println("SV loai TB");

        } else {
            System.out.println("SV loai xuat sac");
        }


        System.out.println("Ket thuc");
    }
}
