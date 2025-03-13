package Semester2.Pertemuan3ALSD;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahDosen;
        System.out.print("Jumlah Dosen : ");
        jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen08[] arrayOfDosen08 = new Dosen08[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen Ke-" + (i+1));
            System.out.print("Kode             : ");
            String kode = sc.nextLine();
            System.out.print("Nama             : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin    : ");
            char jenisKlm = sc.nextLine().toLowerCase().charAt(0);
            boolean jenisKelamin = (jenisKlm == 'p');
            System.out.print("Usia             : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen08[i] = new Dosen08(kode, nama, jenisKelamin, usia);
            System.out.println("-------------------------------------");
        }

        int indexDosen = 1; 
        for (Dosen08 dosen08 : arrayOfDosen08) {
            System.out.println("Data Dosen Ke-" + indexDosen++);
            System.out.println("Kode            : " + dosen08.kode);
            System.out.println("Nama            : " + dosen08.nama);
            System.out.println("Jenis Kelamin   : " + (dosen08.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen08.usia);
            System.out.println("-------------------------------------");
        }

        DataDosen08 dataDosen08 = new DataDosen08();
        dataDosen08.dataSemuaDosen(arrayOfDosen08);
        System.out.println("-------------------------------------");
        dataDosen08.jumlahDosenPerJnsKelamin(arrayOfDosen08);
        System.out.println("-------------------------------------");
        dataDosen08.rataRataUsiaDosenPerJenisKelamin(arrayOfDosen08);
        System.out.println("-------------------------------------");
        dataDosen08.infoDosenTertua(arrayOfDosen08);
        System.out.println("-------------------------------------");
        dataDosen08.infoDosenTermuda(arrayOfDosen08);
    }
}
