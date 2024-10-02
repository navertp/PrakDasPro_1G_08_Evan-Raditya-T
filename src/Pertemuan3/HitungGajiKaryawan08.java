package Pertemuan3;
import java.util.Scanner;

public class HitungGajiKaryawan08 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double jumlahJamKerja;
        int upahPerJam;
        float bonusKaryawan = 10/100f;
        float pajakKaryawan = 5/100f;

        System.out.println("Aplikasi Hitung Gaji");

        System.out.println("");
        System.out.print("Masukkan jumlah jam kerja : ");
        jumlahJamKerja = input.nextDouble();

        System.out.print("Masukkan upah per jam : ");
        upahPerJam = input.nextInt();

        double gajiAwal = jumlahJamKerja * upahPerJam;
        double gajiBonus = gajiAwal + (gajiAwal * bonusKaryawan);
        double gajiPajak = gajiBonus - (gajiBonus * pajakKaryawan);
        double gajiKaryawan = gajiPajak;

        System.out.println("");
        System.out.println("Jumlah jam kerja : " + jumlahJamKerja);
        System.out.println("Gaji Karyawan : " + gajiKaryawan);
    }
}