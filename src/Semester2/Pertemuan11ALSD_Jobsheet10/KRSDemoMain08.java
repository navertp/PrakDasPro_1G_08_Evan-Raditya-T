    package Semester2.Pertemuan11ALSD_Jobsheet10;

    import java.util.Scanner;

    public class KRSDemoMain08 {
        public static void menu() {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cek Antrian Kosong");
            System.out.println("3. Cek Antrian Penuh");
            System.out.println("4. Proses KRS (2 mahasiswa)");
            System.out.println("5. Tampilkan semua antrian");
            System.out.println("6. Tampilkan 2 terdepan");
            System.out.println("7. Tampilkan terakhir");
            System.out.println("8. Kosongkan antrian");
            System.out.println("9. Cetak Jumlah Antrian & Proses");
            System.out.println("0. Keluar");
        }    

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            AntrianKRS08 q = new AntrianKRS08(10);
            int pilih;
            do {
                menu();
                System.out.print("Pilih menu: ");
                pilih = sc.nextInt();
                sc.nextLine();
            
                switch (pilih) {
                    case 1:
                        if (q.isFull()) {
                            System.out.println("Antrian sudah penuh!");
                        } else {
                            System.out.print("NIM: ");
                            String nim = sc.nextLine();
                            System.out.print("Nama: ");
                            String nama = sc.nextLine();
                            System.out.print("Prodi: ");
                            String prodi = sc.nextLine();
                            System.out.print("Kelas: ");
                            String kelas = sc.nextLine();
                            Mahasiswa08 m = new Mahasiswa08(nim, nama, prodi, kelas);
                            q.enqueue(m);
                        }
                        break;
            
                    case 2:
                        System.out.println(q.isEmpty() ? "Antrian sedang kosong." : "Antrian tidak kosong.");
                        break;
            
                    case 3:
                        System.out.println(q.isFull() ? "Antrian sudah penuh." : "Antrian belum penuh.");
                        break;
            
                    case 4:
                        q.prosesKRS();
                        break;
            
                    case 5:
                        q.print();
                        break;
            
                    case 6:
                        q.peek();
                        break;
            
                    case 7:
                        q.peekRear();
                        break;
            
                    case 8:
                        q.clear();
                        break;
            
                    case 9:
                        q.infoJumlah();
                        break;
            
                    case 0:
                        System.out.println("Keluar dari program...");
                        break;
            
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            
            } while (pilih != 0);
        }
    }
