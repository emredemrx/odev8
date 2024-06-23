package org.example;

abstract class Personel {

    private String isim;
    private String soyIsim;
    protected  int dogumYili;


    public Personel(String isim, String soyIsim, int dogumYili) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumYili = dogumYili;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public abstract void yasHesapla();

    public int hesapla(int dogumYili) {
        int bulundugugumuzYil = 2024;
        int i = bulundugugumuzYil - dogumYili;
        return i;
    }
}
