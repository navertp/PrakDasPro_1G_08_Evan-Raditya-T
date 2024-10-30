package Pertemuan9;

import java.util.Scanner;

public class PersegiAngka08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N : ");
        int N = sc.nextInt();

        if (N >= 3) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N harus minimal 3.");
        }
    }
}