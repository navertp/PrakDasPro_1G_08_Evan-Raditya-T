package Pertemuan10;

import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Banyaknya Nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();

        int[] arrNilai = new int [banyakNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = (i + 1);
                break;
            }
        }
        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}
