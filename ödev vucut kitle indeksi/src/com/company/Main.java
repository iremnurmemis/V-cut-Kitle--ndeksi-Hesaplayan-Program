package com.company;

import java.util.Locale;
import java.util.Scanner;

/*Vücut Kitle İndeksi Hesaplama
Formül
Kilo (kg) / Boy(m) * Boy(m)*/
public class Main {

    public static void main(String[] args) {
	    double kilo,boy,vucut_kitle_indeksi;
        Scanner inp=new Scanner(System.in).useLocale(Locale.FRANCE);

        System.out.print("boyunuz(m):");
        boy= inp.nextDouble();

        System.out.print("kilonuz(kg):");
        kilo= inp.nextDouble();

        vucut_kitle_indeksi=kilo/(boy*boy);

        System.out.print("boyunuz:"+boy);
        System.out.print("\nkilonuz:"+kilo);
        System.out.print("\nvücut kitle indeksi:"+vucut_kitle_indeksi);


    }
}
