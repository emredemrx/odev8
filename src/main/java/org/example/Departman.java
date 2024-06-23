package org.example;

import java.util.ArrayList;

public class Departman {
    private String isim;
    private Personel takimLideri;
    private ArrayList<Personel> personeller;
    private ArrayList<String> gorevler;

    public Departman(String isim, Personel takimLideri) {
        this.isim = isim;
        this.takimLideri = takimLideri;
    }
    public void liderDegistir (Personel lider){
        this.takimLideri= lider;
    }
    public void personelEkleme (Personel personel){
        this.personeller.add(personel);
    }
    public void personelCikarma (Personel personel){
        this.personeller.remove(personel);
    }
    public void personelDegistirme (Personel eklenecekPersonel, Personel degisecekPersonel){
        int index = personeller.indexOf(degisecekPersonel);
        this.personeller.set(index, eklenecekPersonel);
    }
    public void gorevEkleme (Personel personel){
        this.personeller.remove(personel);
    }
}


//Oluşturulan bu sınıfın, takım lideri değiştirme,
//personel ekleme/çıkarma/değiştirme, görev ekleme, görevi tamamlandı olarak işaretleme yöntemlerini içermelidir.
// Takım lideri ve personel nesneleri Departman sınıfının örnekleri, görevler ise metin dizisi olarak oluşturmalısınız.