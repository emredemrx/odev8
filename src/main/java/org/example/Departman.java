package org.example;

import java.util.ArrayList;

public class Departman {
    private String departmanIsim;
    private Personel takimLideri;
    private ArrayList<Personel> personeller;
    private ArrayList<String> gorevler;

    public Departman(String departmanIsim, Personel takimLideri) {
        this.departmanIsim = departmanIsim;
        this.takimLideri = takimLideri;
        this.personeller = new ArrayList<>();
        this.gorevler = new ArrayList<>();
    }

    public void liderDegistir (Personel lider){
        this.takimLideri= lider;
    }
    public void personelEkleme (Personel personel){
        //System.out.println(personel.getIsim());
        this.personeller.add(personel);
    }
    public void personelCikarma (Personel personel){
        this.personeller.remove(personel);
    }
    public void personelDegistirme (Personel eklenecekPersonel, Personel degisecekPersonel){
        int index = personeller.indexOf(degisecekPersonel);
        this.personeller.set(index, eklenecekPersonel);
    }
    public void gorevEkleme(String gorev){
        this.gorevler.add(gorev);
    }

    public ArrayList<Personel> getPersoneller() {
        return personeller;
    }

    public ArrayList<String> getGorevler() {
        return gorevler;
    }

    public void yazdirPersonel (){
        for (Personel personel : personeller) {
            System.out.println(personel.getIsim());
        }
    }
}


//Oluşturulan bu sınıfın, takım lideri değiştirme,
//personel ekleme/çıkarma/değiştirme, görev ekleme, görevi tamamlandı olarak işaretleme yöntemlerini içermelidir.
// Takım lideri ve personel nesneleri Departman sınıfının örnekleri, görevler ise metin dizisi olarak oluşturmalısınız.