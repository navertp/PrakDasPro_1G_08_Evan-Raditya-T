package Pertemuan11;

import java.util.Scanner;

public class TugasB08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int nilai;
        double rataResp;

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai survei untuk responden ke-" + (i + 1) + " : ");

            for (int j = 0; j < 6; j++) {
                do {
                    System.out.print("Pertanyaan " + (j + 1) + " : ");
                    nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        survey[i][j] = nilai;
                    } else {
                        System.out.println("Nilai tidak valid. Masukkan nilai antara 1-5.");
                    }
                } while (nilai < 1 || nilai > 5);
            }
        }

        System.out.println("\nNilai rata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            rataResp = total / 6.0;
            System.out.println("Rata-rata untuk responden ke-" + (i + 1) + ": " + rataResp);
        }
    }
}
