package vn.plusplus.javacore.lesson5;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {


        int myArray2[] = {1, 4, -1, 5, 7, 9}; // 6 phan tu
        int size = myArray2.length;
        System.out.println("Size la: " + size);

//        System.out.println("Gia tri cua phan tu thu 6 trong mang la: " + myArray2[6]);

        int counter = 0;
        for(int item : myArray2){
            if(counter%2==0) {
                System.out.println("Gia tri cua phan tu la: " + item);
            }
            counter++;
        }


        for(int i = 0; i< size; i ++){
            System.out.println("Gia tri cua phan tu thu "+ (i+1) + " la: " + myArray2[i]);
        }

    }
}
