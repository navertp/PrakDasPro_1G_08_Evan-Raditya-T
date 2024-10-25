package Pertemuan8;

import java.util.Scanner;

public class GajiPegawaiTokoSepeda08 {
    public static void main(String[] args) {
        Scanner evan = new Scanner(System.in);

        int noHp08, penjualan08, masaKerja08, hariCuti08, menu08, hargaPerSepeda08, totalPenjualan08, tunjangan08 = 0, potonganCuti08;
        String namaKaryawan08, alamat08, lanjut08;
        double komisi08 = 0, totalGaji08 = 0;

        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G ===");
        System.out.println("Dibuat Oleh\t : Evan Raditya Taruna Putra");
        System.out.println("NIM\t \t : 244107020103");
        System.out.println("=============================================");

        do {
            System.out.println("Pilih Menu : ");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji Karyawan");
            System.out.print("Menu : ");
            menu08 = evan.nextInt();
            evan.nextLine();

            if (menu08 == 1) {
                System.out.println("Masukkan Data Karyawan");
                System.out.print("Nama : ");
                namaKaryawan08 = evan.nextLine();
                System.out.print("Alamat : ");
                alamat08 = evan.nextLine();
                System.out.print("No HP : ");
                noHp08 = evan.nextInt();
                System.out.print("Jumlah Penjualan Sepeda : ");
                penjualan08 = evan.nextInt();
                System.out.print("Masa Kerja : ");
                masaKerja08 = evan.nextInt();
                System.out.print("Lama Cuti : ");
                hariCuti08 = evan.nextInt();
                evan.nextLine();

                System.out.print("Apakah Anda ingin mencetak data karyawan? (y/t): ");
                lanjut08 = evan.nextLine();
                if (lanjut08.equalsIgnoreCase("y")) {
                    System.out.println("==================================");
                    System.out.println("Data Karyawan");
                    System.out.println("==================================");
                    System.out.println("Nama : " + namaKaryawan08);
                    System.out.println("Alamat : " + alamat08);
                    System.out.println("No HP : " + noHp08);
                    System.out.println("Jumlah Penjualan Sepeda : " + penjualan08 + " Sepeda");
                    System.out.println("Masa Kerja : " + masaKerja08 + " Tahun");
                    System.out.println("Lama Cuti : " + hariCuti08 + " Hari");
                }

            } else if (menu08 == 2) {
                System.out.print("Masukkan Nama Karyawan : ");
                namaKaryawan08 = evan.nextLine();
                System.out.print("Jumlah Penjualan Sepeda : ");
                penjualan08 = evan.nextInt();
                System.out.print("Masa Kerja : ");
                masaKerja08 = evan.nextInt();
                System.out.print("Lama Cuti : ");
                hariCuti08 = evan.nextInt();
                evan.nextLine();

                hargaPerSepeda08 = 1000000;
                totalPenjualan08 = penjualan08 * hargaPerSepeda08;

                komisi08 = 0;
                if (totalPenjualan08 < 3000000) {
                    komisi08 = totalPenjualan08 * 0.02;
                } else if (totalPenjualan08 >= 3000000 && totalPenjualan08 <= 5000000) {
                    komisi08 = totalPenjualan08 * 0.05;
                } else if (totalPenjualan08 > 5000000 && totalPenjualan08 <= 10000000) {
                    komisi08 = totalPenjualan08 * 0.07;
                } else if (totalPenjualan08 > 10000000) {
                    komisi08 = totalPenjualan08 * 0.15;
                }

                tunjangan08 = 0;
                if (masaKerja08 >= 3 && masaKerja08 <= 5) {
                    tunjangan08 = 1000000;
                } else if (masaKerja08 >= 6 && masaKerja08 <= 8) {
                    tunjangan08 = 2000000;
                } else if (masaKerja08 > 8) {
                    tunjangan08 = 3000000;
                }

                potonganCuti08 = hariCuti08 * 35000;

                totalGaji08 = komisi08 + tunjangan08 - potonganCuti08;

                System.out.println("==================================");
                System.out.println("Data Gaji Karyawan");
                System.out.println("==================================");
                System.out.println("Nama : " + namaKaryawan08);
                System.out.println("Komisi Penjualan : Rp " + (int) komisi08);
                System.out.println("Tunjangan : Rp " + tunjangan08);
                System.out.println("Potongan Cuti : Rp " + potonganCuti08);
                System.out.println("Total Gaji Yang Diterima : Rp " + totalGaji08);
            }

            System.out.print("Kembali ke Menu? (y/t): ");
            lanjut08 = evan.nextLine();
        } while (lanjut08.equalsIgnoreCase("y"));

        System.out.println("Selesai");
    }
}