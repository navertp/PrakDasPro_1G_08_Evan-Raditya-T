package Pertemuan13;

import java.util.Scanner;

public class Kubus08 {
    static int hitungVolume (int sisi) {
        int Volume = sisi*sisi*sisi;
        return Volume;
    }

    static int hitungPermukaan (int sisi) {
        int hitungPer = sisi * sisi * 6;
        return hitungPer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int s, vol, lp;
            
        System.out.print("Masukkan Sisi : ");
        s = sc.nextInt();

        vol = hitungVolume(s);
        System.out.println("Volume Kubus Adalah " + vol);

        lp = hitungPermukaan(s);
        System.out.println("Luas Permukaan Kubus Adalah " + lp);
    }
}