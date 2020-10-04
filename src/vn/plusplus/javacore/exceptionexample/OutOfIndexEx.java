package exceptionexample;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OutOfIndexEx {
    public static void main(String[] args) {
        System.out.println("Before call phepChia func.");
        int ret = 0;
        try {
            ret = phepChia2(23, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Result = " + ret);
        System.out.println("After call phepChia func.");
    }

    private static int phepChia2 (int a, int b) throws Exception{
        System.out.println("phepChia2 func is being run!");
            int c = a / b;
            return c;

    }

    private static int phepChia(int a, int b) {
        System.out.println("phepChia func is being run!");
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
            return -999999;
        } catch (Exception ex){
            System.out.println("Exception 2");
            return 11111;
        } finally {
            System.out.println("Finally block");
        }
    }

    private static int testForReturn(){
        for(int i=0; i<5; i++){
            for(int j=0; j<2; j++){
                if(i==3 && j==1){
                    return 0;
                }
                System.out.println("i=" +i +", j="+j);
            }
        }
        return 100;
    }

}

class Student{
    private String name;
    private String email;

    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
