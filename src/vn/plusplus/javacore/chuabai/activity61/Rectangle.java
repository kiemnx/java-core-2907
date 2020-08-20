package vn.plusplus.javacore.chuabai.activity61;

public class Rectangle {
    private int with;
    private int height;

    public Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int tinhChuVi(){
        int chuVi = (with + height) * 2;
        return chuVi;
    }

    public int tinhDienTich(){
        int dienTich = with * height;
        return dienTich;
    }

    public void print(){
        System.out.println("Chieu dai: " + with);
        System.out.println("Chieu rong: " + height);
    }

    public boolean checkHinhVuong(){
        if(with == height){
            return true;
        } else {
            return false;
        }
    }
}
