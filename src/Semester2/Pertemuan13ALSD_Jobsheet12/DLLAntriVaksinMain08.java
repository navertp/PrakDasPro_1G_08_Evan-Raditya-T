package Semester2.Pertemuan13ALSD_Jobsheet12;

import java.util.Scanner;

public class DLLAntriVaksinMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntriVaksin08 queue = new DLLAntriVaksin08();

        int pilih;
        do {
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRE VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantre Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama Penerima: ");
                    String nama = sc.nextLine();
                    queue.tambahAntrian(nomor, nama);
                    break;
                case 2:
                    queue.kurangiAntrian();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilih != 4);
    }
}
