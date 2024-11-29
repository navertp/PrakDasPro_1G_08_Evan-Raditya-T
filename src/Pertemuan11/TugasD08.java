package Pertemuan11;

import java.util.Scanner;

public class TugasD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];
        int nilai, totalPertanyaan, totalResponden;
        double rataPert, rataResponden, rataKeseluruhan;
        int totalKeseluruhan = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai survei untuk responden ke-" + (i + 1) + ":");

            for (int j = 0; j < 6; j++) {
                do {
                    System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
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
            totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += survey[i][j];
            }
            rataResponden = totalResponden / 6.0;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
            totalKeseluruhan += totalResponden;
        }

        System.out.println("\nNilai rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += survey[i][j];
            }
            rataPert = totalPertanyaan / 10.0;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataPert);
        }

        rataKeseluruhan = totalKeseluruhan / 60.0;
        System.out.println("\nRata-rata keseluruhan dari semua jawaban: " + rataKeseluruhan);
    }
}

