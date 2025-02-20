package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class P1Tugas3_08 {
    static Scanner sc = new Scanner(System.in);
    static int jumlahMatkul;
    static String[] namaMatkul;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;

    public static void inputData() {
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc.nextInt();
        sc.nextLine();

        namaMatkul = new String[jumlahMatkul];
        sks = new int[jumlahMatkul];
        semester = new int[jumlahMatkul];
        hariKuliah = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
    }

    public static void tampilkanSemuaJadwal() {
        System.out.println("\nJADWAL KULIAH");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-25s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
        }
        System.out.println();
    }

    public static void tampilkanJadwalBerdasarkanHari() {
        System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
        String hari = sc.nextLine();
        System.out.println("\nJADWAL KULIAH HARI " + hari.toUpperCase());
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
        System.out.println();
    }

    public static void tampilkanJadwalBerdasarkanSemester() {
        System.out.print("Masukkan semester yang ingin ditampilkan: ");
        int sem = sc.nextInt();
        sc.nextLine();
        System.out.println("\nJADWAL KULIAH SEMESTER " + sem);
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            if (semester[i] == sem) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
        System.out.println();
    }

    public static void cariMataKuliah() {
        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String cari = sc.nextLine();
        System.out.println("\nHASIL PENCARIAN MATA KULIAH");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            if (namaMatkul[i].equalsIgnoreCase(cari)) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
                return;
            }
        }

        System.out.println("Mata kuliah tidak ditemukan.\n");
    }

    public static void menu() {
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                tampilkanSemuaJadwal();
            } else if (pilihan == 2) {
                tampilkanJadwalBerdasarkanHari();
            } else if (pilihan == 3) {
                tampilkanJadwalBerdasarkanSemester();
            } else if (pilihan == 4) {
                cariMataKuliah();
            } else if (pilihan == 5) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    public static void main(String[] args) {
        inputData();
        menu();
    }
}
