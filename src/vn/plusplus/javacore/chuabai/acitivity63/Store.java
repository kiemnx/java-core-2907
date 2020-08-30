package vn.plusplus.javacore.chuabai.acitivity63;

import java.util.Arrays;

public class Store {

    private String storeName;
    private String address;
//    private int n;
    private SmartPhone[] phones;

    public Store(String storeName, String address, SmartPhone[] phones) {
        this.storeName = storeName;
        this.address = address;
//        this.n = n;
        this.phones = phones;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   /* public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }*/

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    public int totalSold () {
        int count = 0;
        for (SmartPhone sm : phones) {
//            if (sm.getTotalSold() <= n) {
                count += sm.getTotalSold();
//            }
        }
        return count;
    }

    public double revalue(){
        double money = 0.0;
        for(SmartPhone sm : phones){
            money += sm.getPrice() * sm.getTotalSold();
        }
        return money;
    }

    public int countPhone5G(){
        int count = 0;
        for(SmartPhone sm : phones){
            if(sm.isHas5g()){
                count ++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}


