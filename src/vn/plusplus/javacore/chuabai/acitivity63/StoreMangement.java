package vn.plusplus.javacore.chuabai.acitivity63;

public class StoreMangement {
    private int n;
    private Store[] stores;

    public StoreMangement(int n, Store[] stores) {
        this.n = n;
        this.stores = stores;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }
}
