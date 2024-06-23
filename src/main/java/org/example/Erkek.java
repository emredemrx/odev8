package org.example;

public class Erkek extends Personel{
    public Erkek(String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
    }

    @Override
    public int yasHesapla() {
        int emeklilikyasinakalan = 65 - hesapla(dogumYili);
        return emeklilikyasinakalan;
    }
}
