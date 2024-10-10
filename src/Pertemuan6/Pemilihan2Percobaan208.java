package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        String member08, jenisPembayaran08;
        int pilihanMenu08;
        double diskon08, harga08 = 0 , totalBayar08, potonganQRIS08 = 1000;
        
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu08 = sc08.nextInt();
        sc08.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member08 = sc08.nextLine();
        System.out.println("--------------------------------------");

        if (member08.equalsIgnoreCase("y")) {
            diskon08 = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu08 == 1) {
                harga08 = 14000;
                System.out.println("Harga Ricebowl = " + harga08);

            } else if (pilihanMenu08 == 2) {
                harga08 = 3000;
                System.out.println("Harga Ice Tea = " + harga08);

            } else if (pilihanMenu08 == 3) {
                harga08 = 15000;
                System.out.println("Harga Bundling = " + harga08);  
            

        } else {
            System.out.println("Masukkan Pilihan Menu Dengan Benar");
            return;
        }
        
        totalBayar08 = harga08 - (harga08 * diskon08);

        System.out.print("Apakah anda ingin membayar menggunakan QRIS (y/n) ? = ");
        jenisPembayaran08 = sc08.nextLine();

        if (jenisPembayaran08.equalsIgnoreCase("y")) {
            totalBayar08 -= potonganQRIS08;
            System.out.println("Potongan QRIS sebesar Rp. 1.000 telah diterapkan");
        }

        System.out.println("Total bayar setelah diskon = " + totalBayar08);}
    
    
    else if (member08.equalsIgnoreCase("n")) {
            if (pilihanMenu08 == 1) {
                harga08 = 14000;
                System.out.println("Harga Ricebowl = " + harga08);
            
            } else if (pilihanMenu08 == 2) {
                harga08 = 3000;
                System.out.println("Harga Ice Tea = " + harga08);

            } else if (pilihanMenu08 == 3) {
                harga08 = 15000;
                System.out.println("Harga Bundling = " + harga08);

        } else {
            System.out.println("Masukkan Pilihan Menu Dengan Benar");
            return;
        }
        System.out.print("Apakah anda ingin membayar menggunakan QRIS (y/n) ? = ");
        jenisPembayaran08 = sc08.nextLine();

        if (jenisPembayaran08.equalsIgnoreCase("y")) {
            harga08 -= potonganQRIS08;
            System.out.println("Potongan QRIS sebesar Rp. 1.000 telah diterapkan");
            
        System.out.println("Total Bayar = " + harga08);
}
    } else
        System.out.println("Member tidak valid");
        
        System.out.println("--------------------------------------");
}
}