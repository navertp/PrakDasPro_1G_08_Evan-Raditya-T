package Semester2.Pertemuan2ALSD;

import java.util.Scanner;

public class Dosen08 {
    Scanner sc = new Scanner(System.in);

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status == true) {
            statusAktif = true;
        } else {
            statusAktif = false;
        }
    }

    public int hitungMasaKerja(int thnSkrg) {
        int lamaKerja;
        lamaKerja = thnSkrg - tahunBergabung;
        System.out.println("Lama Kerja Dosen : " + lamaKerja + " Tahun");
        return lamaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen08 () {
    }

    public Dosen08 (String id, String nm, Boolean stsAktif, int thBergabung, String bdgKeahlian) {
        idDosen = id ;
        nama = nm;
        statusAktif = stsAktif;
        tahunBergabung = thBergabung;
        bidangKeahlian = bdgKeahlian;
    }
}
