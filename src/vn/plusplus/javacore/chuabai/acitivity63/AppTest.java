package vn.plusplus.javacore.chuabai.acitivity63;

public class AppTest {
    public static void main(String[] args) {
        Store[] stores = new Store[5];
        for(Store store : stores){
            store.setAddress("");
            store.setStoreName("");
            SmartPhone[] smartPhones = new SmartPhone[10];
            for(SmartPhone  smartPhone : smartPhones){
                //Nhap thong tin cua tung loai smartphone
            }
            store.setPhones(smartPhones);
        }

        StoreMangement storeMangement = new StoreMangement(stores.length, stores);
        for(Store store : stores) {
            System.out.println(store.toString());
        }

        int total5g = 0;
        for(Store store : stores) {
//            store.totalSold()
//            store.revalue();
            total5g += store.countPhone5G();
        }


    }
}
