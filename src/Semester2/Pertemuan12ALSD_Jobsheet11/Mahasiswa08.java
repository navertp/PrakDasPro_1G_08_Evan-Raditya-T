package Semester2.Pertemuan12ALSD_Jobsheet11;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + " \t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
