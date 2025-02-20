package Semester2.Pertemuan2ALSD;

import java.util.Scanner;

public class MataKuliah08 {
    Scanner sc = new Scanner(System.in);

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah :" + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS Berhasil Diubah");
    }

    void tambahJam(int jam) {
        jumlahJam = jumlahJam + jam; 
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan Jam Gagal. Jumlah jam awal lebih kecil dari jam pengurang");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah Jam setelah dikurangi : " + jumlahJam);
        }
    }

    public MataKuliah08 () {
    }

    public MataKuliah08 (String kode, String nm, int sks, int jumlahJm) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jumlahJm;
    }
}
