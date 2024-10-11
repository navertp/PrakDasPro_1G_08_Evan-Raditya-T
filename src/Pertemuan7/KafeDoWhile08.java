package Pertemuan7;

import java.util.Scanner;

public class KafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int kopi08, teh08, roti08;
        String namaPelanggan08;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga08 = 0;

        do {
            System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan08 = sc.nextLine();
            if (namaPelanggan08.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi : ");
            kopi08 = sc.nextInt();
            System.out.print("Jumlah Teh : ");
            teh08 = sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti08 = sc.nextInt();
            totalHarga08 = (kopi08 * hargaKopi) + (teh08 * hargaTeh) + (roti08 * hargaRoti);
            System.out.println("Total Yang Harus Dibayar Rp " + totalHarga08);
            sc.nextLine();
        } while (true);

        System.out.println("Semua Transaksi Selesai");
    }
}
