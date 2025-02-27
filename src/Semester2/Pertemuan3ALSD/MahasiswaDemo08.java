package Semester2.Pertemuan3ALSD;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa08[] arrayOfMahasiswa08 = new Mahasiswa08[3];
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa08[i] = new Mahasiswa08 ();

            System.out.println("Masukkan Data Mahasiswa Ke-" + (i+1));
            System.out.print("NIM      : ");
            arrayOfMahasiswa08[i].nim = sc.nextLine();
            System.out.print("Nama     : ");
            arrayOfMahasiswa08[i].nama = sc.nextLine();
            System.out.print("Kelas    : ");
            arrayOfMahasiswa08[i].kelas = sc.nextLine();
            System.out.print("IPK      : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa08[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i+1));
            arrayOfMahasiswa08[i].cetakInfo();
        }

        Mahasiswa08[] myArrayOfMahasiswa08 = new Mahasiswa08[3];
        myArrayOfMahasiswa08[0].nim = "244107060033";
        myArrayOfMahasiswa08[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa08[0].kelas = "SIB-1E";
        myArrayOfMahasiswa08[0].ipk = (float) 3.75;
    }
}
