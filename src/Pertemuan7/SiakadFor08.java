package Pertemuan7;

import java.util.Scanner;

public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nilai08, tertinggi08 = 0, terendah08 = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai08 = sc.nextDouble();
            if (nilai08 > tertinggi08) {
                tertinggi08 = nilai08;
            }
            if (nilai08 < terendah08) {
                terendah08 = nilai08;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi08);
        System.out.println("Nilai Terendah : " + terendah08);
    }
}

