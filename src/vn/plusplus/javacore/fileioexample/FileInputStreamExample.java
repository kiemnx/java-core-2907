package fileioexample;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\java-core\\data\\student.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            int i;
            while ((i=fileInputStream.read()) != -1){
                System.out.print((char) i);
            }
//            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("Doc file bi loi");
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
