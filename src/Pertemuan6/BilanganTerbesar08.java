package Pertemuan6;

import java.util.Scanner;

public class BilanganTerbesar08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner (System.in);

        int bil1, bil2, bil3, bilanganTerbesar08;

        System.out.print("Masukkan Bilangan Pertama : ");
        bil1 = sc08.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        bil2 = sc08.nextInt();
        System.out.print("Masukkan Bilangan Ketiga : ");
        bil3 = sc08.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                bilanganTerbesar08 = bil1;
            } else {
                bilanganTerbesar08 = bil3;
            }
        }else if (bil2 >= bil3) {
            bilanganTerbesar08 = bil2;
        } else {
            bilanganTerbesar08 = bil3;
        }

        System.out.println("Bilangan Terbesar : " + bilanganTerbesar08);
    }
}