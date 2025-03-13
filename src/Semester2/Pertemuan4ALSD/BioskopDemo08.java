package Semester2.Pertemuan4ALSD;

import java.util.Scanner;

public class BioskopDemo08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bioskop08[] arrayOfBioskop08 = new Bioskop08[2];

        for (int i = 0; i < arrayOfBioskop08.length; i++) {
            System.out.println("Masukkan Data Studio ke-" + (i + 1) + " di Bioskop XXI Sawojajar");

            System.out.print("Masukkan Film yang sedang tayang di studio " + (i + 1) + ": ");
            String namaFilm = sc.nextLine();

            int studio = i + 1;

            System.out.print("Masukkan Jumlah Kursi pada Studio " + (i + 1) + ": ");
            int jumlahKursi = Integer.parseInt(sc.nextLine());

            System.out.print("Masukkan Jumlah Kursi yang sudah Terpenuhi di Studio " + (i + 1) + ": ");
            int kursiTerpenuhi = Integer.parseInt(sc.nextLine());

            arrayOfBioskop08[i] = new Bioskop08(namaFilm, studio, jumlahKursi, kursiTerpenuhi);
        }

        System.out.println("\n=== INFORMASI BIOSKOP XXI SAWOJAJAR ===");
        for (Bioskop08 bioskop08 : arrayOfBioskop08) {
            bioskop08.tampilInformasi();
            bioskop08.penuhTidak();
            System.out.println("--------------------------------------");
        }
    }
}
