package vn.plusplus.javacore.chuabai.acitivity63;

public class AppTest {
    public static void main(String[] args) {
        Store[] stores = new Store[5];
        for(int i=0; i<stores.lenght; i++){
            Store store = new Store();
            store.setAddress("");
            store.setStoreName("");
            SmartPhone[] smartPhones = new SmartPhone[10];
            for(int j=0; j<smartPhones.lenght; j++){
                SmartPhone smartPhone = new SmartPhone();
                smartPhone.setName("");
                //Nhap thong tin cua tung loai smartphone
                smartPhones[i] = smartPhone;
            }
            store.setPhones(smartPhones);
            stores[i] = store;
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
