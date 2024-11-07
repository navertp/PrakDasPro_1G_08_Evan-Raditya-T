package Pertemuan10;

import java.util.Scanner;

public class ProgramNilaiMahasiswa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        int total = 0, nilaiTertinggi = 0, nilaiTerendah = 0;
        double rata2;

        System.out.print("Masukkan Nilai Mahasiswa Ke-1: ");
        nilaiMhs[0] = sc.nextInt();
        nilaiTertinggi = nilaiMhs[0];
        nilaiTerendah = nilaiMhs[0];
        total += nilaiMhs[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        rata2 = total / jumlahMahasiswa;

        System.out.println();
        System.out.println("Nilai Mahasiswa yang Dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println();
        System.out.println("Rata - Rata Nilai = " + rata2);
        System.out.println("Nilai Tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai Terendah = " + nilaiTerendah);
    }
}
