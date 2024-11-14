package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama : ");
                        nama = sc.nextLine();
                        
                        while (true) {
                            System.out.print("Masukkan Baris : ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan Kolom : ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                                if (penonton[baris - 1][kolom - 1] == null) {
                                    break;
                                } else {
                                    System.out.println("Kursi sudah terisi. Pilih kursi yang lain");
                                }
                            } else {
                                System.out.println("Nomor baris atau kolom tidak tersedia");
                            }
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan");

                        System.out.print("Input penonton lainnya? (y/n) : ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton : ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.printf("Baris %d, Kolom %d: %s", i + 1, j + 1, penonton[i][j]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program selesai");
                    return;

                default:
                    System.out.println("Pilihan Invalid");
            }
        }
    }
}
