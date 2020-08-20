package vn.plusplus.javacore.chuabai.activity61;

public class Test {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Chu vi hinh la: " + rectangle.tinhChuVi());
        System.out.println("Dien tich la: " + rectangle.tinhDienTich());
        rectangle.print();
        boolean checkHinhVuong = rectangle.checkHinhVuong();
        if(checkHinhVuong == true){
            System.out.println("Day la hinh vuong");
        } else {
            System.out.println("Day la hinh chu nhat");
        }
    }
}
