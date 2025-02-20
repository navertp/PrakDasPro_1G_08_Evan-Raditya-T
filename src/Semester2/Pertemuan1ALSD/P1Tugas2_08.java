package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class P1Tugas2_08 {
    static Scanner sc = new Scanner(System.in);

    public static void menuAwal() {
        System.out.println("MENU PERHITUNGAN KUBUS");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        int pilihanMenu;
        double sisi;

        do {
            menuAwal();
            pilihanMenu = sc.nextInt();

            if (pilihanMenu >= 1 && pilihanMenu <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = sc.nextDouble();
            } else {
                sisi = 0;
            }

            switch (pilihanMenu) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihanMenu != 4);
    }
}
