package Pertemuan10;

import java.util.Scanner;

public class PemesananCafe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan]; 
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();

            totalBiaya += hargaPesanan[i];
        }

        System.out.println();
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}   
    