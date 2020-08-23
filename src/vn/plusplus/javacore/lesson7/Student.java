package vn.plusplus.javacore.lesson7;

public class Student extends People{
    private String mssv;
    private String classRoom;
    private float gpa;

    public Student() {
    }

    public Student(String name, int age, String phone, String email, String address, String gender, String mssv, String classRoom, float gpa) {
        super(name, age, phone, email, address, gender);
        this.mssv = mssv;
        this.classRoom = classRoom;
        this.gpa = gpa;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void printBasicInfo(String name){
        System.out.println("GPA: " + gpa);
    }

    public void print(){
        super.printBasicInfo();
        printBasicInfo();
    }

}
