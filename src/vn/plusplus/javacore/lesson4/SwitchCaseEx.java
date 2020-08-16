package vn.plusplus.javacore.lesson4;

public class SwitchCaseEx {
    public static void main(String[] args) {

        int a  = 12;

        switch (a){
            case 1: {
                System.out.println("A  = 1");
                break;
            }
            case 5: {
                System.out.println("A = 5");
                break;
            }
            case 10: {
                System.out.println("A  = 10");
                break;
            }
            default: {
                System.out.println("A khac 1,5,10");
                break;
            }
        }

        /*if(a == 1){
            System.out.println("A = 1");
        } else if(a == 5){
            System.out.println("A = 5");
        } else if(a == 10){
            System.out.println("A = 10");
        } else {
            System.out.println("A khac 1,5,10");
        }*/

        System.out.println("Ket thuc");
    }
}
