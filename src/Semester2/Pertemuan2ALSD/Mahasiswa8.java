package Semester2.Pertemuan2ALSD;

import java.util.Scanner;

public class Mahasiswa8 {
    Scanner sc = new Scanner(System.in);

    String nama;
    String nim;
    String kelas;
    public double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipk <= 0.0 || ipk >= 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        } else {
            ipk = ipkBaru;
        }
    }
    String nilaiKinerja() {
    if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }

    public Mahasiswa8() {
    }

    public Mahasiswa8(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}
