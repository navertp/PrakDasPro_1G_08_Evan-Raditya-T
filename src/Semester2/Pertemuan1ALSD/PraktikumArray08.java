package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class PraktikumArray08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] namaMatkul = new String[8];
        int [] bobotSKS = new int[8];
        double [] nilaiAngka = new double[8];
        String [] nilaiHuruf = new String[8];
        double [] nilaiSetara = new double[8];
        int totalSKS = 0;
        double ipSemester = 0;

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nama Matkul Ke- " + (i + 1) + " : ");
            namaMatkul[i] = sc.nextLine();
        }
        System.out.println();

        for (int i = 0; i < bobotSKS.length; i++) {
            System.out.print("Masukkan Bobot SKS dari MK " + namaMatkul[i] + " : ");
            bobotSKS[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAngka.length; i++) {
            totalSKS += bobotSKS[i];
        }

        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + namaMatkul[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (nilaiAngka [i] > 80 && nilaiAngka [i] <= 100) {
                nilaiHuruf [i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka [i] > 73 && nilaiAngka [i] <= 80) {
                nilaiHuruf [i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka [i] > 65 && nilaiAngka [i] <= 73) {
                nilaiHuruf [i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka [i] > 60 && nilaiAngka [i] <= 65) {
                nilaiHuruf [i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka [i] > 50 && nilaiAngka [i] <= 60) {
                nilaiHuruf [i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka [i] > 39 && nilaiAngka [i] <= 50) {
                nilaiHuruf [i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf [i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        double setaraXbobot = 0;
        for (int i = 0; i < nilaiSetara.length; i++) {
            setaraXbobot += nilaiSetara[i] * bobotSKS[i];
        }

        ipSemester = setaraXbobot / totalSKS;

        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.printf("%-50s %-20s %-20s %-20s \n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.printf("%-50s %-20.2f %-20s %-20.2f \n", namaMatkul[i], nilaiAngka [i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("=====================");
        System.out.printf("IP : %.2f%n", ipSemester);
    }
}
