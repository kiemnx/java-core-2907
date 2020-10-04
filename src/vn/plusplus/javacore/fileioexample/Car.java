package fileioexample;

import java.io.Serializable;

public class Car implements Serializable {
    private String ten;
    private String bienSo;
    private String ngayDo;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getNgayDo() {
        return ngayDo;
    }

    public void setNgayDo(String ngayDo) {
        this.ngayDo = ngayDo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ten='" + ten + '\'' +
                ", bienSo='" + bienSo + '\'' +
                ", ngayDo='" + ngayDo + '\'' +
                '}';
    }
}
