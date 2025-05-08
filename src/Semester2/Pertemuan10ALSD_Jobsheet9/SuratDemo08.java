package Semester2.Pertemuan10ALSD_Jobsheet9;

import java.util.Scanner;

public class SuratDemo08 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat08 stack = new StackSurat08(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (Hari): ");
                    int durasi = sc.nextInt();
                    Surat08 s = new Surat08(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.printf("Surat dari %s berhasil diterima\n", nama);
                    break;

                case 2:
                    Surat08 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat08 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari " + terakhir.namaMahasiswa);
                        System.out.println(terakhir.idSurat + "\t" + terakhir.kelas + "\t" + terakhir.jenisIzin + "\t" + terakhir.durasi);
                    } else {
                        System.out.println("Belum ada surat yang diterima");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa : ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
