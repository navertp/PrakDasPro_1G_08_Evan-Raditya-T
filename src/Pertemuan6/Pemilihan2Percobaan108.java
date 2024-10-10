package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan108 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int tahun08;

        System.out.print("Masukkan Tahun: ");
        tahun08 = sc08.nextInt();

        if ((tahun08 % 4) == 0) {
            if ((tahun08 % 100) == 0) {
                if ((tahun08 % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }

        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
    
}