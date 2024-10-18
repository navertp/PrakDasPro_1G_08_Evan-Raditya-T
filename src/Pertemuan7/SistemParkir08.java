package Pertemuan7;

import java.util.Scanner;

public class SistemParkir08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jenis08, durasi08, total08 = 0;
        
        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar) : ");
            jenis08 = sc.nextInt();
            
            if (jenis08 == 1 || jenis08 == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi08 = sc.nextInt();
                
                if (durasi08 > 5) {
                    total08 += 12500;
                } else {
                    if (jenis08 == 1) {
                        total08 += durasi08 * 3000;
                    } else if (jenis08 == 2) {
                        total08 += durasi08 * 2000;
                    }
                }
            } else if (jenis08 != 0) {
                System.out.println("Input tidak valid! Silakan pilih 1, 2, atau 0.");
            }
            
        } while (jenis08 != 0);
        
        System.out.println("Total pembayaran parkir: Rp " + total08);
    }
}