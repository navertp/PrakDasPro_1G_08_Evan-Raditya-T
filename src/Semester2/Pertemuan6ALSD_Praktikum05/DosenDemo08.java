package Semester2.Pertemuan6ALSD_Praktikum05;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        DataDosen08 data = new DataDosen08(jumlah);
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (1 = Laki-laki, 0 = Perempuan): ");
            boolean jenisKelamin = sc.nextInt() == 1;
            sc.nextLine();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();
            
            Dosen08 dsn = new Dosen08(kode, nama, jenisKelamin, usia);
            data.tambah08(dsn);
        }
        
        int pilihan = 0;
        do {
            System.out.println("\nMENU PILIHAN");
            System.out.println("1. Tampil Data Dosen");
            System.out.println("2. Sorting ASC (Termuda ke Tertua)");
            System.out.println("3. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Cari Data Dosen Berdasarkan Nama (Sequential Search)");
            System.out.println("6. Cari Data Dosen Berdasarkan Usia (Binary Search)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");
            
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nData Dosen:");
                    data.tampil();
                    break;
                    
                case 2:
                    System.out.println("\nData setelah sorting ASC berdasarkan usia:");
                    data.sortingASC();
                    data.tampil();
                    break;
                    
                case 3:
                    System.out.println("\nData setelah sorting DSC berdasarkan usia:");
                    data.sortingDSC();
                    data.tampil();
                    break;
                    
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi");
                    break;
                
                case 5:
                    System.out.print("\nMasukkan nama dosen yang dicari: ");
                    sc.nextLine();
                    String namaCari = sc.nextLine();
                    data.pencarianDataSequential08(namaCari);
                    break;
                
                case 6:
                    System.out.print("\nMasukkan usia dosen yang dicari: ");
                    int usiaCari = sc.nextInt();
                    data.pencarianDataBinary08(usiaCari);
                    break;
                
                case 7:
                    System.out.println("Terima kasih telah menggunakan aplikasi");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);     
    }
}
