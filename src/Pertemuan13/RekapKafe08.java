package Pertemuan13;

import java.util.Scanner;

public class RekapKafe08 {
    public static int[][] inputData(Scanner sc, String[] menu) {
        int[][] penjualan = new int[menu.length][7];
        
        System.out.println("Input data penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        return penjualan;
    }

    public static int cariTotalPenjualan(int[] penjualanPerMenu) {
        int total = 0;
        for (int penjualan : penjualanPerMenu) {
            total += penjualan;
        }
        return total;
    }

    public static String cariTerlaris(String[] menu, int[][] penjualan) {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = cariTotalPenjualan(penjualan[i]);
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        return menuTerlaris;
    }

    public static double hitungRataRata(int[] penjualanPerMenu) {
        int totalPenjualan = cariTotalPenjualan(penjualanPerMenu);
        return totalPenjualan / 7.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = inputData(sc, menu);

        System.out.println("\nData Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }

        String terlaris = cariTerlaris(menu, penjualan);
        System.out.println("\nMenu Terlaris: " + terlaris);

        System.out.println("\nRata-rata Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            double rataRata = hitungRataRata(penjualan[i]);
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
}
