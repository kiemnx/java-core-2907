package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
        Student svA = new Student("kiemnx", 28, 2.5f);
        Student svB = new Student("long", 22, 3.0f);
        Student svC = new Student("thanh", 23, 2.8f);

        ArrayList<Student> students = new ArrayList<>();
        students.add(svA);
        students.add(svB);
        students.add(svC);

        /*Student[] students = new Student[3];
        students[0]=svA;
        students[1]=svB;
        students[2]=svC;

        Student temp = null;
        for(int i=0; i<students.length; i++){
            for (int j = i; j<students.length; j++){
                if(students[i].getGpa() < students[j].getGpa()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j]=temp;
                }
            }
        }*/
        System.out.println("Sap xep theo age");
        Comparator<Student> orderAge = new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getAge() < st2.getAge()){
                    return 1;
                } else if(st1.getAge() == st2.getAge()){
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(students, orderAge);
//        Collections.reverse(students);
        for (Student st : students) {
            System.out.println(st.toString());
        }

        System.out.println("Sap xep theo GPA");
        Comparator<Student> orderGpa = new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getGpa() < st2.getGpa()){
                    return 1;
                } else if(st1.getGpa() == st2.getGpa()){
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(students, orderGpa);
        for (Student st : students) {
            System.out.println(st.toString());
        }


    }
}


class Student {
    private String name;
    private Integer age;
    private Float gpa;

    public Student(String name, Integer age, Float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    /*@Override
    public int compareTo(Student o) {
        //A > B => 1
        //A = B => 0
        //A < B => -1

        if (this.gpa < o.getGpa()) {
            return 1;
        } else if (this.gpa == o.getGpa()) {
            return 0;
        } else {
            return -1;
        }
    }*/
}