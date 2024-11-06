package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs= new int[jumlahMhs];
        int mhsLulus = 0, mhsTidakLulus = 0;
        double total = 0;
        double rata2, rata2Lulus = 0, rata2TidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                rata2Lulus += nilaiMhs[i];
            } else {
                mhsTidakLulus++;
                rata2TidakLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = rata2Lulus / mhsLulus;
        rata2TidakLulus = rata2TidakLulus / mhsTidakLulus;

        System.out.println("Rata-rata Nilai Lulus = " + rata2Lulus);
        System.out.println("Rata-rata Nilai Tidak lulus = " + rata2TidakLulus);

        //rata2 = total/nilaiMhs.length;
        //System.out.println("Rata - Rata Nilai = " + rata2);
        //System.out.println("Jumlah Mahasiswa Yang Lulus Sebanyak " + mhsLulus + " Mahasiswa");
    }
}
