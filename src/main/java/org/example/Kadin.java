package org.example;

public class Kadin extends Personel{
    public Kadin(String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
    }

    @Override
    public void yasHesapla() {
        int emeklilikyasinakalan = 60 - hesapla(dogumYili);
        System.out.println(emeklilikyasinakalan);
    }
}
