package vn.plusplus.javacore.lesson6;

public class Student {
    String name;
    int age;
    float gpa;
    String email;

    public Student(String name, int age, float gpa) {
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
