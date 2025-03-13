package Semester2.Pertemuan5ALSD;

import java.util.Scanner;

public class MainPangkat08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen : ");
        int elemen = sc.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Basis Elemen ke-" + (i+1) + " : ");
            int basis = sc.nextInt();
            System.out.print("Masukkan Nilai Pangkat Elemen ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat08(basis, pangkat);
        }

        System.out.println("Hasil Pangkat Brute Force");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("Hasil Pangkat Divide and Conquer");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
