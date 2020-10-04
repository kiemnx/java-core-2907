package fileioexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        // Ghi du lieu

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\java-core\\data\\Car.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Car car = new Car();
        car.setTen("Huyndai elantra");
        car.setBienSo("30F12345");
        car.setNgayDo("20-09-2020");
        objectOutputStream.writeObject(car);

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\java-core\\data\\Car.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car carIn = (Car) objectInputStream.readObject();
        System.out.println(carIn.toString());
    }
}
