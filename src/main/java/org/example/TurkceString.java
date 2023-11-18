package org.example;

import java.util.Scanner;
public class TurkceString {
    private static String icerik;
    private int index;

    public TurkceString(String icerik) {
        this.icerik = icerik;
    }
    public static char karakterAl(int index) {
        if (index < 0 || index >= icerik.length()) {
            System.out.println("Geçersiz index");
            return 0;
        }
        return icerik.charAt(index);
    }

    public int indexBul(String karakter) {
        int foundIndex = icerik.indexOf(karakter);
        if (foundIndex == -1) {
            System.out.println("Karakter bulunamadı");
        }
        return foundIndex;
    }

    public String altIfade(int baslangic, int bitis) {
        if (baslangic < 0 || bitis > icerik.length() || baslangic > bitis) {
            System.out.println("Geçersiz başlangıç veya bitiş değeri");
            return "";
        }
        return icerik.substring(baslangic, bitis);
    }


}

