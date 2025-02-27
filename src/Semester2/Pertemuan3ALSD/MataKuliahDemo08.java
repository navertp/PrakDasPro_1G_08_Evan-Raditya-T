package Semester2.Pertemuan3ALSD;

import java.util.Scanner;

public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah08[] arrayOfMataKuliah08 = new MataKuliah08[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah08[i] = new MataKuliah08();
            arrayOfMataKuliah08[i].tambahData(sc);
        }
    

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i+1));
            System.out.println("Kode       : " + arrayOfMataKuliah08[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah08[i].nama);
            System.out.println("SKS        : " + arrayOfMataKuliah08[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah08[i].jumlahJam);
            System.out.println("-----------------------------");
        }
    }
}
