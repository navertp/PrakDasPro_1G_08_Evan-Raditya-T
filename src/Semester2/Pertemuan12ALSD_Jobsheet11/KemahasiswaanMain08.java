package Semester2.Pertemuan12ALSD_Jobsheet11;

import java.util.Scanner;

public class KemahasiswaanMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKemahasiswaan08 queue = new QueueKemahasiswaan08();
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    Kemahasiswaan08 k = new Kemahasiswaan08(nim, nama);
                    queue.enqueue(k);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.print();
                    break;
                case 6:
                    System.out.println("Jumlah antrian : " + queue.getSize());
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih !");
                    break;
                default:
                    System.out.println("Pilihan invalid !");
            }
        } while (pilih != 0);
    }
}
