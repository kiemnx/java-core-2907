package vn.plusplus.javacore.chuabai.activity62;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement(int n) {
        students = new Student[n];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Nhap vao ten SV thu: " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Nhap vao GPA SV thu: " + (i+1));
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Student(name, gpa);
        }
    }

    public int countDo(){
        int counter =0;
        for(Student st : students){
            if(st.checDo() == true){
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int countTruot(){
        int counter =0;
        for(Student st : students){
            if(st.checDo() == false){
                counter = counter + 1;
            }
        }
        return counter;
    }

}
