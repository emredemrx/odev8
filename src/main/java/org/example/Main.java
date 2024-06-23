package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personel personel = new Erkek("AHMET", "CAN" , 1980);
        personel.yasHesapla();
        Personel personel1 = new Erkek("mehmet", "CAN" , 1998);
        personel1.yasHesapla();
        Personel personel2 = new Erkek("veli", "CAN" , 1995);
        personel2.yasHesapla();
        Personel personel3 = new Erkek("cabbar", "CAN" , 1989);
        personel3.yasHesapla();

        Departman departman = new Departman("IT", personel);
        departman.personelEkleme(personel1);

        departman.liderDegistir(personel1);
        departman.personelCikarma(personel);
        departman.personelDegistirme(personel3,personel1);

        departman.gorevEkleme("otomasyon Testi");
        departman.gorevEkleme("web testi");
        System.out.println(departman.getGorevler());

        Personel personel5 = new Erkek("berk", "CAN" , 1989);
        personel3.yasHesapla();
        departman.personelEkleme(personel5);
        departman.yazdirPersonel();
    }
}