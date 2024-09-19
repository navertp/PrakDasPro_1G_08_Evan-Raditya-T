import java.util.Scanner;
public class Quiz08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tanggalBerangkat08, bulanBerangkat08, tahunBerangkat08, hariSE;

        System.out.println("Nama \t : Evan Raditya Taruna Putra");
        System.out.println("NIM \t : 244107020103");
        System.out.println("Absen \t : 08");

        System.out.println("========== QUIZ TI - 1G ===========");

        System.out.print("Masukkan Tanggal Berangkat : ");
        tanggalBerangkat08 = sc.nextInt();
        System.out.print("Masukkan Bulan Berangkat : ");
        bulanBerangkat08 = sc.nextInt();
        System.out.print("Masukkan Tahun Berangkat : ");
        tahunBerangkat08 = sc.nextInt();

        System.out.println("Tanggal Berangkat : " + tanggalBerangkat08 + "-" + bulanBerangkat08 + "-" + tahunBerangkat08);

        System.out.println("");
        
        System.out.println("=========== Masukkan Berapa Lama Anda SC ===========");

        System.out.print("Berapa Lama Anda SE Dalam Hari : ");
        hariSE = sc.nextInt();
        
        int tahun08 = hariSE / 360;
        int sisaHari08 = hariSE % 360;
        int bulan08 = sisaHari08 / 30;
        int hari08 = sisaHari08 % 30;

        System.out.println("Lama SE dalam tahun : " + tahun08 + "Tahun" + bulan08 + "Bulan" + hari08 + "Hari");

        


    }
}