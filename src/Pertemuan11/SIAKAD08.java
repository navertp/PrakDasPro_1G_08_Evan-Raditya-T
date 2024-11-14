package Pertemuan11;

import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSiswa, jumlahMatkul;

        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc.nextInt();
        sc.nextLine();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input Nilai Mahasiswa Ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai Rata-Rata Mahasiswa Ke-" + (i + 1) + " : " + totalPerSiswa / jumlahMatkul);
        }

        System.out.println("\n================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah : ");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + " : " + totalPerMatkul / jumlahSiswa);
        }
    }
}
