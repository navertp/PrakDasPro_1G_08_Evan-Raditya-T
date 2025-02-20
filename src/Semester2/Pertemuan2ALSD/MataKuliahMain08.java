package Semester2.Pertemuan2ALSD;

public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 matkul1 = new MataKuliah08();
        matkul1.kodeMK = "ALSD_TI";
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(2);
        matkul1.tampilInformasi();
        System.out.println("---------------------------------");

    MataKuliah08 matkul2 = new MataKuliah08("BD_TI", "Basis Data", 3, 6);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(2);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(4);
        matkul2.tampilInformasi();
        System.out.println("---------------------------------");


    MataKuliah08 matkul3 = new MataKuliah08("SISOP_TI", "Sistem Operasi", 2, 4);
        matkul3.tampilInformasi();
        matkul3.ubahSKS(3);
        matkul3.tambahJam(1);
        matkul3.kurangiJam(6);
        matkul3.tampilInformasi();    
    }
}