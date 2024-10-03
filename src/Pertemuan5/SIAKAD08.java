package Pertemuan5;

import java.util.Scanner;

public class SIAKAD08 {
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String nama, nim;
    String kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    String nilaiHuruf, kualifikasi;

    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukkan Kelas: ");
    kelas = sc.nextLine();
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();

    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai UTS: ");
    nilaiUTS = sc.nextDouble();
    System.out.print("Masukkan nilai UAS: ");
    nilaiUAS = sc.nextDouble();

    nilaiAkhir = (nilaiKuis*0.2) + (nilaiTugas*0.15) + (nilaiUTS*0.3) + (nilaiUAS*0.35);

    if (nilaiAkhir > 80 && nilaiAkhir <=100) {
        nilaiHuruf = "A";
        kualifikasi = "Sangat Baik";
    }  else if (nilaiAkhir > 73 && nilaiAkhir <=80) {
        nilaiHuruf = "B+";
        kualifikasi = "Lebih Dari Baik";
    }  else if (nilaiAkhir > 65 && nilaiAkhir <=73) {
        nilaiHuruf = "B";
        kualifikasi = "Baik";
    }  else if (nilaiAkhir > 60 && nilaiAkhir <=65) {
        nilaiHuruf = "C+";
        kualifikasi = "Lebih Dari Cukup";
    }  else if (nilaiAkhir > 50 && nilaiAkhir <=60) {
        nilaiHuruf = "C";
        kualifikasi = "Cukup";
    }  else if (nilaiAkhir > 39 && nilaiAkhir <=50) {
        nilaiHuruf = "D";
        kualifikasi = "Kurang";
    }  else if (nilaiAkhir >= 0 && nilaiAkhir <=39) {
        nilaiHuruf = "E";
        kualifikasi = "Gagal";
    }  else {
        nilaiHuruf = "Nilai Invalid";
        kualifikasi = "Invalid";
    }

    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);
    System.out.println("Nilai Huruf: " + nilaiHuruf);
    System.out.println("Kualifikasi: " + kualifikasi);
    }
}