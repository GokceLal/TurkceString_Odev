package org.example;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("İfadeyi giriniz");
                String ifade = sc.next();
                TurkceString metin = new TurkceString(ifade);
        int istek;
        do{

        System.out.println("Seçiminiz(karakteral / indexof / altifade)");
        String secim = sc.next();

                switch (secim){

                    case "karakteral":
                        System.out.println("İndex numarası giriniz: ");
                        int index = sc.nextInt();
                        TurkceString.karakterAl(index);
                        System.out.println(index+". index'teki karakter: " + metin.karakterAl(index));
                        System.out.println("Tekrar işlem yapmak için 1 e basın");
                        istek = sc.nextInt();
                        break;
                    case "indexof":
                        System.out.println("İfadede bulmak istediğiniz değeri giriniz: ");
                        String karakter = sc.next();
                        System.out.println(karakter+" karakterinin ilk bulunduğu index: " + metin.indexBul(karakter));
                        System.out.println("Tekrar işlem yapmak için 1 e basın");
                        istek = sc.nextInt();
                        break;
                    case "altifade":
                        System.out.println("Başlangıç değerini giriniz: ");
                        int baslangicdeg= sc.nextInt();
                        System.out.println("Bitiş değerini giriniz: ");
                        int bitisdeg = sc.nextInt();
                        System.out.println(baslangicdeg+"-"+bitisdeg+" aralığındaki alt ifade: "
                                + metin.altIfade(baslangicdeg,bitisdeg));
                        System.out.println("Tekrar işlem yapmak için 1 e basın");
                        istek = sc.nextInt();
                        break;
                    default:
                        System.out.println("Seçiminizi yanlış girdiniz: ");
                        System.out.println("Tekrar işlem yapmak için 1 e basın");
                        istek = sc.nextInt();

                }


                }while(istek == 1);
            }
        }







