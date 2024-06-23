package org.example;

public class Kadin extends Personel{

    public Kadin(String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
    }
    @Override
    public int yasHesapla() {
        int emeklilikyasinakalan = 60 - hesapla(dogumYili);
        return emeklilikyasinakalan;
    }
}
