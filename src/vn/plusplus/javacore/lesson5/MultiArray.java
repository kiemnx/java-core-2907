package vn.plusplus.javacore.lesson5;

public class MultiArray {
    public static void main(String[] args) {

        int[][] myArray = new int[3][2]; // 3 hang, 2 cot

        int[][] myArray2 = {{1,2,3},{2,-1,0}};  // 2 hang, 3 cot
        /*
        * 1, 2, 3
        * 2,-1, 0
        * */

        number[] soNguyen = new number[3];
        soNguyen[0] = new number(1, 2);
        soNguyen[1] = new number(2,-1);
        soNguyen[2] = new number(3, 0);



        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.println(myArray2[i][j]);
            }
        }

        for(number item : soNguyen){
            System.out.println(item.getI() + " " + item.getJ());
        }

    }
}

class number{
    int i;
    int j;
    String name = "";
    float gpa;

    public number(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
