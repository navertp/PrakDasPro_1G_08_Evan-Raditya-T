import java.util.Scanner;

public class TagihanListrik08 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String namaPelanggan;
        double tarif = 1500.0;
        int penggunaan;

        System.out.println("Aplikasi Tagihan Listrik");

        System.out.println("");
        System.out.print("Masukkan nama pelanggan : ");
        namaPelanggan = input.nextLine();

        System.out.print("Masukkan penggunaan listrik : ");
        penggunaan = input.nextInt();

        double totalHarga = penggunaan * tarif;

        System.out.println("");
        System.out.println("Nama pelanggan : " + namaPelanggan);
        System.out.println("Total Tagihan : " + totalHarga);

        boolean check = penggunaan > 500;
        System.out.println("Apakah penggunaan listrik anda melebihi 500 kWh? " + check);
        }
}