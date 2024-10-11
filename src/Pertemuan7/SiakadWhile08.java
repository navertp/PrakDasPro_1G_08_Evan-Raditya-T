package Pertemuan7;

import java.util.Scanner;

public class SiakadWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int nilai08, jml08, i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jml08 = sc.nextInt();

        while (i < jml08) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + ": ");
            nilai08 = sc.nextInt();

            if (nilai08 < 0 || nilai08 > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai08 > 80 && nilai08 <= 100) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah A");
            } else if (nilai08 > 73 && nilai08 <= 80) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah B+");
            } else if (nilai08 > 65 && nilai08 <= 73) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah B");
            } else if (nilai08 > 60 && nilai08 <= 65) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah C+");
            } else if (nilai08 > 50 && nilai08 <= 60) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah C");
            } else if (nilai08 > 39 && nilai08 <= 50) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
    }
}
