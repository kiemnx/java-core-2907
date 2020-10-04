package fileioexample;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader file  = new FileReader("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\java-core\\data\\ParkingList.txt");
        BufferedReader bufferedReader =new BufferedReader(file);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            String[] items = line.split("###");
            Car car = new Car();
            car.setTen(items[0].split("=")[1]);
            car.setBienSo(items[1].split("=")[1]);
            car.setNgayDo(items[2].split("=")[1]);
            System.out.println("Car info: " + car.toString());
        }
        bufferedReader.close();
        file.close();
    }
}
