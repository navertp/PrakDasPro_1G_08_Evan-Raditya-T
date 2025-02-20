package Semester2.Pertemuan2ALSD;

public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 dsn1 = new Dosen08();
        dsn1.idDosen = "DS-1";
        dsn1.nama = "Bayu Prayoga";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2017;
        dsn1.bidangKeahlian = "Desain";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Coding");
        System.out.println("--------------------------");
        dsn1.tampilInformasi();
        System.out.println("==========================");

    Dosen08 dsn2 = new Dosen08("DS-2", "Akbar Rais", true, 2019, "Coding");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Desain");
        System.out.println("--------------------------");
        dsn2.tampilInformasi();
    }
}
