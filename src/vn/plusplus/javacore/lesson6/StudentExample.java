package vn.plusplus.javacore.lesson6;


public class StudentExample {
    public static void main(String[] args) {

        Student sinhVienA = new Student();
        sinhVienA.setName("Nguyen Van A");

//        Student sinhVienB = new Student("Nguyen Van B", 22, 3.0f);
//        Student sinhVienC = new Student("Nguyen Van C", 19, 2.0f);


        sinhVienA.getName();
//        sinhVienC.getAge();

        System.out.println(sinhVienA.getAge());
    }
}
