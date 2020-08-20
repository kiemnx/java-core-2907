package vn.plusplus.javacore.lesson5;

import vn.plusplus.javacore.lesson6.Student;

public class ArrayEx {
    public static void main(String[] args) {

        int myArray[] = {24, 127, 20, 2, 24, 15};  //6 phan tu
        int a = 10;

        String[] mssv = {"A", "B", "C", "D"};
        for(String s : mssv){
            System.out.println(s);
        }

       /* System.out.println("BEFORE increment A: " + a);
        a = incrementA(a);
        System.out.println("AFTER increment A: " + a);


        System.out.println("BEFORE increment array: " + toString(myArray));


        incrementArray(myArray);


        System.out.println("AFTER increment array: " + toString(myArray));*/
    }




    public static int incrementA(int a){
        a = a +1;
        return a;
    }

    public static String toString(int[] a){
        String result = "";
        for(int item : a){
            result += item +", ";
        }

        return result;
    }

    public static void incrementArray(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = a[i] + 1;
        }
    }
}
