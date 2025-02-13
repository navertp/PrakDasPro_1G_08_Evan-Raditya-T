package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class PraktikumPemilihan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextDouble();

        System.out.println("======================");
        System.out.println("======================");
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100 ) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        }

        nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");


        if (nilaiHuruf == "D" || nilaiHuruf == "E") {
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }   
}