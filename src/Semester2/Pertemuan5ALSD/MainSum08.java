package Semester2.Pertemuan5ALSD;

import java.util.Scanner;

public class MainSum08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen : ");
        int elemen = sc.nextInt();

        Sum08 sm = new Sum08(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total Keuntungan menggunakan Brute Force : " + sm.totalBF());
        System.out.println("Total Keuntungan menggunakan Divide and Conquer : " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}
