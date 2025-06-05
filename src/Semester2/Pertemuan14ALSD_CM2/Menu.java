package Semester2.Pertemuan14ALSD_CM2;

import java.util.Scanner;

    public class Menu {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            Layanan antrian = new Layanan();
            TransaksiLayanan[] riwayatTransaksi = new TransaksiLayanan[100];
            int jumlahTransaksi = 0;
            int menu;

            do {
                System.out.println("=== SISTEM ANTRIAN KLINIK ===");
                System.out.println("1. Tambah Pasien ke Antrian");
                System.out.println("2. Lihat Antrian");
                System.out.println("3. Layani Pasien");
                System.out.println("4. Cek Sisa Antrian Pasien");
                System.out.println("5. Lihat Riwayat Transaksi");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        System.out.print("Nama Pasien: ");
                        String nama = sc.nextLine();
                        System.out.print("NIK: ");
                        String nik = sc.nextLine();
                        System.out.print("Keluhan: ");
                        String keluhan = sc.nextLine();
                        Pasien pasien = new Pasien(nama, nik, keluhan);
                        antrian.tambahAntrian(pasien);
                        System.out.println(">> Pasien masuk ke dalam antrian.");
                        System.out.println();
                        break;

                    case 2:
                        antrian.tampilkanAntrian();
                        System.out.println();
                        break;

                    case 3:
                        Pasien pasienDilayani = antrian.front.antrian;
                        System.out.println("Pasien " + pasienDilayani.nama + " dipanggil");
                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = sc.nextLine();
                        Dokter dokter = new Dokter(idDokter, namaDokter);
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int durasi = sc.nextInt();
                        sc.nextLine();

                        TransaksiLayanan transaksi = new TransaksiLayanan(pasienDilayani, dokter, durasi);
                        riwayatTransaksi[jumlahTransaksi] = transaksi;
                        jumlahTransaksi++;

                        antrian.hapusAntrian();
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                        System.out.println();
                        break;

                    case 4:
                        System.out.println(">> Sisa pasien dalam antrian: "+antrian.sisaAntrian());
                        System.out.println();
                        break;

                    case 5:
                        System.out.println("-- Riwayat Transaksi --");
                        System.out.println("Daftar Transaksi:");
                        for (int i = 0; i < jumlahTransaksi; i++) {
                            TransaksiLayanan t = riwayatTransaksi[i];
                            t.riwayatLayanan(t);
                        }
                        System.out.println();
                        break;

                    case 0:
                        return;

                    default:
                        System.out.println("Pilihan tidak tersedia.");
                        break;
                }
            } while (menu!=0);
        }
    }
