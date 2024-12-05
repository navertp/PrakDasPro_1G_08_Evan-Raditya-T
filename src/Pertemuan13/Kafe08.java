package Pertemuan13;
import java.util.Scanner;

public class Kafe08 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah Member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Mendapat Diskon 50%");
        }
        else if (kodePromo.equals("DISKON30")) {
            System.out.println("Mendapat Diskon 30%");
        }
        else
            System.out.println("Kode Invalid");
        
        System.out.println("===== MENU RESTO CAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik = Rp 12,000");
        System.out.println("5. Roti Bakar - 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan Pilih Menu yang Anda Inginkan.");
    }
    
    public static int hitungTotalHarga08(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;

        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
            
        } else if (kodePromo.equals("")) {
            System.out.println("Kode Invalid");
        }
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = sc.nextLine();
        
        System.out.print("Apakah Anda Member? : ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();
        
        System.out.print("Masukkan Kode Promo: ");
        String kodePromo = sc.nextLine();
        
        Menu(namaPelanggan, isMember, kodePromo);
        
        System.out.print("\nMasukkan Nomor Menu yang ingin Anda Pesan: ");
        int pilihanMenu = sc.nextInt();
        
        System.out.print("Masukkan Jumlah Item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        
        int totalHarga = hitungTotalHarga08(pilihanMenu, banyakItem, kodePromo);
        
        System.out.println("Total Harga untuk pesanan Anda : Rp " + totalHarga);
    }
}
