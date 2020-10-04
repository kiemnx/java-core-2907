package fileioexample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageExample {
    public static void main(String[] args){
        try {
            FileInputStream reader = new FileInputStream("C:\\Users\\han-haop\\Pictures\\airplane-flying_1.jpg");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(reader);



            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\java-core\\data\\anh.jpg");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            long start = System.currentTimeMillis();
            int i;
            int counter = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
                counter ++;
            }
            long end = System.currentTimeMillis();
            System.out.println("Loop: " + counter + " in " + (end-start) + " ms");
            reader.close();
            outputStream.close();
        }catch (Exception e){
            System.out.println("Chuong trinh bi loi");
        }
    }
}
