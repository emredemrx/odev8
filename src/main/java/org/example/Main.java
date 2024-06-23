package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personel personel = new Erkek("Ahmet", "Demir" , 1980);
        personel.yasHesapla();
        Personel personel1 = new Erkek("Mehmet", "Taş" , 1998);
        personel1.yasHesapla();
        Personel personel2 = new Erkek("Veli", "Deli" , 1995);
        personel2.yasHesapla();
        Personel personel3 = new Kadin("Aslı", "Can" , 1989);
        personel3.yasHesapla();

        Departman departman = new Departman("IT", personel);
        departman.personelEkleme(personel1);

        departman.liderDegistir(personel1);
        departman.personelCikarma(personel);
        departman.personelDegistirme(personel3,personel1);

        departman.gorevEkleme("otomasyon Testi");
        departman.gorevEkleme("web testi");
        // System.out.println(departman.getGorevler());

        Personel personel5 = new Erkek("Berk", "Cakmak" , 1989);
        personel5.yasHesapla();
        departman.personelEkleme(personel5);
        departman.yazdirPersonel();
    }
}