package Pertemuan6;

import java.util.Scanner;

public class TokoSepatu08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String merk08, kategori08;
        int ukuran08, hargaSepatu08 = 0;

        System.out.print("Masukkan Merk Sepatu : ");
        merk08 = sc08.nextLine();
        System.out.print("Masukkan Kategori : ");
        kategori08 = sc08.nextLine();
        System.out.print("Masukkan Ukuran : ");
        ukuran08 = sc08.nextInt();

        if (merk08.equalsIgnoreCase("Converse")) {
            if (kategori08.equalsIgnoreCase("Slip On")) {
                if (ukuran08 >= 36) {
                    if (ukuran08 <= 40) {
                        hargaSepatu08 = 800000;
                    } else {
                        System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                    }
                } else {
                    System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                }
            } else if (kategori08.equalsIgnoreCase("High Top")) {
                if (ukuran08 >= 40) {
                    if (ukuran08 <= 44) {
                        hargaSepatu08 = 1200000;
                    }
                }
            }
        } else if (merk08.equalsIgnoreCase("Sketcher")) {
            if (kategori08.equalsIgnoreCase("Woman")) {
                if (ukuran08 >= 36) {
                    if (ukuran08 <= 41) {
                        hargaSepatu08 = 1000000;
                    } else {
                        System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                    }
                } else {
                    System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                }
            } else if (kategori08.equalsIgnoreCase("Man")) {
                if (ukuran08 >= 41) {
                    if (ukuran08 <= 44) {
                        hargaSepatu08 = 1800000;
                    } else {
                        System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                    }
                } else {
                    System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                }
            } else {
                System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
            }
        } else if (merk08.equalsIgnoreCase("Nike")) {
            if (kategori08.equalsIgnoreCase("Kids")) {
                if (ukuran08 >= 36) {
                    if (ukuran08 <= 40) {
                        hargaSepatu08 = 750000;
                    } else {
                        System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                    }
                } else {
                    System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                }
            } else if (kategori08.equalsIgnoreCase("Adults")) {
                if (ukuran08 >= 40) {
                    if (ukuran08 <= 44) {
                        hargaSepatu08 = 1500000;
                    } else {
                        System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                    }
                } else {
                    System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
                }
            } else {
                System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
            }
        } else {
            System.out.println("Input Invalid. Masukkan Data Sepatu yang Benar");
        }
        System.out.println("Harga Sepatu : " + hargaSepatu08);
    }
}