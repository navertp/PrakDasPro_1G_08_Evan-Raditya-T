package Pertemuan5;

import java.util.Scanner;

public class Kafe08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu;
        double harga, totalBayar, diskon = 0;
        int jumlah;

        System.out.print("Masukkan menu makanan : ");
        menu = sc.nextLine();
        System.out.print("Masukkan harga : ");
        harga = sc.nextDouble();
        System.out.print("Masukkan jumlah : ");
        jumlah = sc.nextInt();

        totalBayar = jumlah * harga;
        if (totalBayar > 100000 && totalBayar < 200000) {
            diskon = 0.02;
        } else if (totalBayar >= 200000 && totalBayar < 500000) {
            diskon = 0.05;
        } else if (totalBayar > 500000) {
            diskon = 0.1;
        }

        totalBayar = totalBayar - (totalBayar * diskon);
        System.out.println("Diskon yang diperoleh : " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayarkan : " + totalBayar);
    }
}
