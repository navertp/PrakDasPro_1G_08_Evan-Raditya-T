package Semester2.Pertemuan6ALSD_Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = 5;
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(m);
        }
            
            list.tampil();
            System.out.println("--------------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("--------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = sc.nextDouble();
            
            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss= (int)posisi;
            list. tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);
        
        // System.out.println("\nData mahasiswa sebelum sorting: ");
        // list.tampil();
        
        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();
        
        // System.out.println("Data Yang Sudah Terurut Menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data Yang Sudah Terurut Menggunakan INSERTION SORT (DESC)");
        // list.insertionSort();
        // list.tampil();
    }
}
