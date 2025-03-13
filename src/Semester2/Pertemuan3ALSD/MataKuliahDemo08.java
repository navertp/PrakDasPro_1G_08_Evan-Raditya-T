package Semester2.Pertemuan3ALSD;

import java.util.Scanner;

public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMatkul = Integer.parseInt(sc.nextLine());

        MataKuliah08[] arrayOfMataKuliah08 = new MataKuliah08[jumlahMatkul];


        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah08[i] = new MataKuliah08();
            arrayOfMataKuliah08[i].tambahData(sc);
        }
    

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah08[i].cetakInfo();
        }
    }
}
