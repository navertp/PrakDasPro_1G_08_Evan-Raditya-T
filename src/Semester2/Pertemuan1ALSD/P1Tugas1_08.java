package Semester2.Pertemuan1ALSD;

import java.util.Scanner;

public class P1Tugas1_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Masukkan Kode Plat : ");
        char input = sc.next().toUpperCase().charAt(0);
        int indeksKota = -1;

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                indeksKota = i;
                break;
            }
        }

        if (indeksKota != -1) {
            System.out.print("Kota Dengan Plat Nomor " + input + " : ");
            for (int j = 0; j < KOTA[indeksKota].length; j++) {
                System.out.print(KOTA[indeksKota][j]);
            }
            System.out.println();
        }
    }
}