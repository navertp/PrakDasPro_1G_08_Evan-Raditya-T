package Pertemuan9;

import java.util.Scanner;

public class RataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i, j, nilaiMhs;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while (i<=5) {
            totalNilai=0;
            System.out.println("Input Nilai Mahasiswa Ke-" + i);

            for (j=1;j<=5;j++) {
                System.out.print("Nilai Ke-" +j +" = ");
                nilaiMhs = sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai = totalNilai/5;

            System.out.println("Rata-rata Nilai Mahasiswa Ke-" + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }
    }
}