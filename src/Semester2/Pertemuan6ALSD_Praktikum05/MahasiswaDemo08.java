package Semester2.Pertemuan6ALSD_Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumlah);
        for (int i = 0; i < jumlah; i++) {
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
        
        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();
        
        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Data Yang Sudah Terurut Menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Yang Sudah Terurut Menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}
