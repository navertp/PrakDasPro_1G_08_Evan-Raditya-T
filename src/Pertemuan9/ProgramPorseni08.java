package Pertemuan9;

import java.util.Scanner;

public class ProgramPorseni08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PORSENI POLITEKNIK NEGERI MALANG 2024 ===");
        System.out.print("Jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("\nNama politeknik ke-" + i + ": ");
            String namaPoliteknik = sc.nextLine();

            System.out.print("Jumlah cabang olahraga yang diikuti: ");
            int jumlahCabor = sc.nextInt();
            sc.nextLine();

            for (int j = 1; j <= jumlahCabor; j++) {
                System.out.print("Nama cabang olahraga ke-" + j + ": ");
                String namaOlahraga = sc.nextLine();

                System.out.print("Jumlah atlet untuk cabang " + namaOlahraga + " : ");
                int jumlahAtlet = sc.nextInt();
                sc.nextLine();
                String daftarAtlet = "";

                for (int k = 1; k <= jumlahAtlet; k++) {
                    System.out.print("Nama atlet ke-" + k + ": ");
                    String namaAtlet = sc.nextLine();
                    daftarAtlet += k + ". " + namaAtlet + "\n";
                }

                System.out.println("\n" + namaPoliteknik + " - Cabang: " + namaOlahraga);
                System.out.println("Atlet yang berpartisipasi:");
                System.out.print(daftarAtlet);
                System.out.println();
            }
        }
    }
}