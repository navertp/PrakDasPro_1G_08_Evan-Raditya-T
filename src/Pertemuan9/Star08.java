package Pertemuan9;

import java.util.Scanner;

public class Star08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Niai N =");
        int N = sc.nextInt();
        
        for(int i=1; i <= N; i++){
            System.out.print("*");
        }
    }
}
