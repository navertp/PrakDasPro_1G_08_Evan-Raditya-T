package Semester2.Pertemuan14ALSD_CM2;

public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan=0, biaya=50000;

    TransaksiLayanan (Pasien pasien, Dokter dokter, int durasi) {
        this.pasien=pasien;
        this.dokter=dokter;
        durasiLayanan=durasi;
    }

    public int hitungBiaya () {
        return durasiLayanan*biaya;
    }

    public void riwayatLayanan (TransaksiLayanan riwayat) {
        System.out.println(riwayat.pasien.nama+" ("+riwayat.durasiLayanan+" jam): Rp "+riwayat.hitungBiaya());
    }
}