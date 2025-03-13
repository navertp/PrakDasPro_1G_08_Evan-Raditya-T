package Semester2.Pertemuan5ALSD;

import java.util.Scanner;

public class MainFaktorial08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        Faktorial08 fk = new Faktorial08();
        System.out.println("Nilai Faktorial" + nilai + " menggunakan BF: " + fk.faktorialBf(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
