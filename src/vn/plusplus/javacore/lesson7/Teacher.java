package vn.plusplus.javacore.lesson7;

public class Teacher extends People{

    private String level;
    private String major;
    private long salary;



    public Teacher() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printInfo(){
        System.out.println("Salary: " + salary);
    }
}
