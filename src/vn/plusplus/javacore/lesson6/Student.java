package vn.plusplus.javacore.lesson6;

public class Student {
    private String name;
    private int age;
    private float gpa;
    private int maxAge = 200;

   /* public Student() {
    }
    String name;
    int age;
    float gpa;
    String email;

    public Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }*/

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String nameA, int age) {
        name = nameA;
        this.age = age;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int tinhTong(int a, int b){
        System.out.println("Day la ham tinh tong 2 so");
        return a + b;
    }
    public int tinhTong(int a, int b, int c){
        System.out.println("Day la ham tinh tong 3 so");
        return a + b + c;
    }
}

/*

interface Aexample{
    String getName();

}

class Example implements Aexample{

    @Override
    public String getName() {
        return "Long";
    }
}*/
