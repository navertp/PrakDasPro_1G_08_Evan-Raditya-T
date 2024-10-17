package Pertemuan7;

import java.util.Scanner;

public class PenjualanTiket08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket08, totalTiket08 = 0;
        double hargaTiket08 = 50000, totalHarga08 = 0, diskon08 = 0, hargaDiskon08, totalPenjualan08 = 0, persenDiskon08 = 0;
        String lanjut08 = "y";

        do {
            System.out.print("Masukkan Tiket Yang Dibeli : ");
            tiket08 = sc.nextInt();
            sc.nextLine();

            if (tiket08 < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket dengan benar");
                continue;
            }

            totalHarga08 = tiket08 * hargaTiket08;

            if (tiket08 > 10) {
                diskon08 = totalHarga08 * 0.15;
                persenDiskon08 = 15;
            } else if (tiket08 > 4) {
                diskon08 = totalHarga08 * 0.10;
                persenDiskon08 = 10;
            } else {
                diskon08 = 0;
                persenDiskon08 = 0;
            }

            hargaDiskon08 = totalHarga08 - diskon08;

            totalTiket08 += tiket08;
            totalPenjualan08 += hargaDiskon08;

            System.out.println("Total Harga Sebelum Diskon : Rp " + totalHarga08);
            System.out.println("Mendapat Diskon Sebesar " + persenDiskon08 + " %");
            System.out.println("Mendapat Potongan Harga Sebesar Rp " + diskon08);
            System.out.println("Total harga untuk " + tiket08 + " tiket: Rp " + hargaDiskon08);

            System.out.print("Ada Pembelian Tiket Selanjutnya ? (y/n) : ");
            lanjut08 = sc.nextLine();

        } while (lanjut08.equalsIgnoreCase("y"));

        System.out.println("Total Tiket Yang Terjual Hari Ini : " + totalTiket08);
        System.out.println("Total Penjualan Tiket Hari Ini : Rp " + totalPenjualan08);
    }
}