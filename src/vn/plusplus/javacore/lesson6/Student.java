package vn.plusplus.javacore.lesson6;

public class Student {
    private String name;
    private int age;
    private float gpa;
    private int maxAge = 200;

   /* public Student() {
    }

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
        if(age > 0){
            this.age = age;
        }
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
