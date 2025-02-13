package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class PraktikumPerulangan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long nim;

        System.out.print("Masukkan NIM : ");
        nim = sc.nextLong();
        System.out.println("=====================");

        long n = nim%100;

        if (n < 10) {
            n += 10;
        }

        System.out.println("N : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10)
                continue;

        if (i % 2 == 1) {
            System.out.print("*");
        } else {
            System.out.print(i);
        }
        }  
    }
}