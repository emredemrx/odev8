package org.example;

public class Erkek extends Personel{
    public Erkek(String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
    }

    @Override
    public void yasHesapla() {
        int emeklilikyasinakalan = 65 - hesapla(dogumYili);
        System.out.println(emeklilikyasinakalan);
    }

}
