package Pertemuan12;

import java.util.Scanner;

public class KuisSoalA08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        
        String bulan [] = {"Jan", "Feb", "Maret", "April"};
        String nama [] = {"Sito", "Semi", "RIsma", "Vero", "Barri"};
        int[][] hariMasuk08 = new int[][]{
            {29, 30, 29, 28},
            {30, 30, 30, 25},
            {30, 0, 28, 27},
            {30, 30, 30, 0},
            {0, 29, 28, 27} 
        };

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Tampilkan Daftar Hadir Karyawan");
            System.out.println("2. Tampilkan Potongan Gaji dan Total");
            System.out.print("Pilih Menu : ");
            int pilihan08 = sc08.nextInt();
            
            switch (pilihan08) {
                case 1:
                    for (String)
                    
                        for (int j = 0; j < hariMasuk08.length; j++) {
                            System.out.print(hariMasuk08 [i][j] + " ");
                        }

                    System.out.println();

                    }
                    break;
                case 2:
                    if (hariMasuk08 ) {
 
                    }

                default:
                System.out.println("Invalid");
                    break;
            }
        }
    }
}
