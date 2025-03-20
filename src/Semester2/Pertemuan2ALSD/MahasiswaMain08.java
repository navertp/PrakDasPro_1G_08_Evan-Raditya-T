package Semester2.Pertemuan2ALSD;

public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa8 mhs1 = new Mahasiswa8();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        
        Mahasiswa8 mhs2 = new Mahasiswa8("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa8 mhsEvanRaditya = new Mahasiswa8("Evan Raditya", "244107020103", 3.56, "TI 1G");
        mhsEvanRaditya.tampilkanInformasi();
        mhsEvanRaditya.updateIpk(3.57);
        mhsEvanRaditya.ubahKelas("TI 2G");
        mhsEvanRaditya.tampilkanInformasi();
    }
}
