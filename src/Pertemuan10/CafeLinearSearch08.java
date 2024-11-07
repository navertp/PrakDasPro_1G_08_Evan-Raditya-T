package Pertemuan10;

import java.util.Scanner;

public class CafeLinearSearch08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String makananDicari;
        int hasil = 0;

        System.out.println("Menu yang tersedia:");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        
        System.out.println();
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        makananDicari = sc.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                hasil = (i + 1);
                break;
            }
        }
        System.out.println();
        if (hasil != 0) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu, merupakan menu ke-" + hasil);
        } else {
            System.out.println("Maaf, makanan " + makananDicari + " tidak tersedia di menu.");
        }
        System.out.println();
    }
}
