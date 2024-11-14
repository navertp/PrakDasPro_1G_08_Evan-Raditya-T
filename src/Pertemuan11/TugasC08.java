package Pertemuan11;

import java.util.Scanner;

public class TugasC08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int nilai;
        double rataPert;

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

        System.out.println("\nNilai rata-rata untuk setiap pertanyaan : ");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            rataPert = total / 10.0;
            System.out.println("Pertanyaan ke-" + (j + 1) + " : " + rataPert);
        }
    }
}
