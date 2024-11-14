package Pertemuan11;

import java.util.Scanner;

public class TugasA08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] survey = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai survei untuk responden ke-" + (i + 1) + ":");

            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " : ");
                int nilai = input.nextInt();

                while (!(nilai >= 1 && nilai <= 5)) {
                    System.out.print("Nilai tidak valid. Masukkan nilai antara 1-5: ");
                    nilai = input.nextInt();
                }
                survey[i][j] = nilai;
            }
        }
    }
}
