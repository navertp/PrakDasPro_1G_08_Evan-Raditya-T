package Semester2.Pertemuan12ALSD_Jobsheet11;

public class Kemahasiswaan08 {
    String nim, nama;

    public Kemahasiswaan08(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampil() {
        System.out.printf("%-10s %-15s\n", nim, nama);
    }
}
