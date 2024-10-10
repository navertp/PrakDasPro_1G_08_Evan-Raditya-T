package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan308 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner (System.in);

        String kategori08;
        int penghasilan08, gajiBersih08;
        double pajak08 = 0;

        System.out.print("Masukkan Kategori : ");
        kategori08 = sc08.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan08 = sc08.nextInt();

        if (kategori08.equalsIgnoreCase("Pekerja")) {
            if (penghasilan08 <= 2000000) {
                pajak08 = 0.1;}

            else if (penghasilan08 <= 3000000) {
                pajak08 = 0.15;}
    
            else
                pajak08 = 0.2;

        gajiBersih08 = (int) (penghasilan08 - (pajak08 * penghasilan08));
        System.out.println("Penghasil Bersih : " +gajiBersih08);
        
    } else if (kategori08.equalsIgnoreCase("Pebisnis")) {
        if (penghasilan08 <= 2500000)
            pajak08 = 0.15;

        else if (penghasilan08 <= 3500000)
            pajak08 = 0.2;

        else
            pajak08 = 0.25;

        gajiBersih08 = (int) (penghasilan08 - (pajak08 * penghasilan08));
        System.out.println("Penghasil Bersih : " + gajiBersih08);

        } else
        System.out.println("Masukan Kategori Salah");
    }
}