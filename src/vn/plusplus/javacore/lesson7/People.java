package vn.plusplus.javacore.lesson7;

public class People {

    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;
    private String gender;

    public People() {
    }

    public People(String name, int age, String phone, String email, String address, String gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phone;
        this.email = email;
        this.address = address;
        this.gender = gender;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printBasicInfo(){
        System.out.println("Ten nguoi: " + name);
        System.out.println("So tuoi: " + age);
    }
}
