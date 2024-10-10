package Pertemuan6;

import java.util.Scanner;

public class DiskonBuku08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner (System.in);

        String jenisBuku08;
        int jumlahBuku08;
        double diskon08 = 0;

        System.out.print("Masukkan Jenis Buku yang Dibeli : ");
        jenisBuku08 = sc08.nextLine();
        System.out.print("Masukkan Jumlah Buku yang Dibeli : ");
        jumlahBuku08 = sc08.nextInt();

        if (jenisBuku08.equalsIgnoreCase("kamus") && jumlahBuku08 > 2) {
            diskon08 = 12;
        }    
        else if (jenisBuku08.equalsIgnoreCase("kamus")) {
            diskon08 = 10;
        }
        else if (jenisBuku08.equalsIgnoreCase("novel") && jumlahBuku08 > 3) {
            diskon08 = 9;
        }
        else if (jenisBuku08.equalsIgnoreCase("novel")) {
            diskon08 = 8;
        }
        else if (jumlahBuku08 > 3) {
            diskon08 = 5;
        }
        System.out.println("Jumlah Diskon yang Didapat : " + diskon08 + "%");
    }
}