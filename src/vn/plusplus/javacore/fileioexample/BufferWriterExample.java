package fileioexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class BufferWriterExample {
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\java-core\\data";
        File file = new File(filePath);
        if(file.isFile()){
            System.out.println(true);
        } else {
            System.out.println(false);
            List<File> fileList = Arrays.asList(file.listFiles());
            for(File f : fileList){
                System.out.println(f.getName());
            }
        }

        FileWriter fileWriter = new FileWriter(file, true);
        /*BufferedWriter bf = new BufferedWriter(fileWriter);

        bf.write("Java Core");
        bf.newLine();
        bf.write("Python Core");
        bf.flush();

        bf.close();
        System.out.println("Done");*/

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append("\n").append("Long").append("\n").append("kiem");
        printWriter.flush();
        System.out.println("Done");
    }
}
