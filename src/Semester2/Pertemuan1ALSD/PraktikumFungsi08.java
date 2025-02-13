package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class PraktikumFungsi08 {
    Scanner sc = new Scanner(System.in);

    static int[][] stokBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] rincianHarga = {75000, 50000, 60000, 10000};
    static int[] bungaMati = {1, 2, 0, 5};

    static void pendapatanPerCabang() {
        System.out.println("Pendapatan Per Cabang Jika Semua Bunga Habis Terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < rincianHarga.length; j++) {
                pendapatan += stokBunga[i][j] * rincianHarga[j];
            }
            System.out.printf("RoyalGarden %d: Rp %,d%n", (i + 1), pendapatan);
        }
        System.out.println();
    }

    static void kurangiStokBungaMatiRoyalGarden4() {
        for (int j = 0; j < stokBunga[3].length; j++) {
            stokBunga[3][j] -= bungaMati[j];
        }
    }

    static void tampilkanStokRoyalGarden4() {
        System.out.println("Stok Bunga di RoyalGarden 4 setelah bunga mati:");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.printf("%-15d %-10d %-10d %-10d%n", 
                          stokBunga[3][0], stokBunga[3][1], stokBunga[3][2], stokBunga[3][3]);
    }

    public static void main(String[] args) {
        pendapatanPerCabang();
        kurangiStokBungaMatiRoyalGarden4();
        tampilkanStokRoyalGarden4();
    }
}