package vn.plusplus.javacore.lesson6;


public class StudentExample {
    public static void main(String[] args) {

        Student sinhVienA = new Student("Nguyen Van A");
        System.out.println("Tong 2 so la: " + sinhVienA.tinhTong(3, 4));
        System.out.println("Tong 3 so la: " + sinhVienA.tinhTong(3, 4, 5));

        String s = "Hello";
    }
}
