package Semester2.Pertemuan5ALSD;

public class MainNilai08 {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        Nilai08 nilaiMhs = new Nilai08(nama, uts, uas);

        int nilaiMax = nilaiMhs.cariMaxDC(0, uts.length - 1);
        int nilaiMin = nilaiMhs.cariMinDC(0, uts.length - 1);
        String namaMax = nilaiMhs.cariNama(nilaiMax);
        String namaMin = nilaiMhs.cariNama(nilaiMin);

        System.out.println("Nilai UTS tertinggi: " + nilaiMax + " (" + namaMax + ")");
        System.out.println("Nilai UTS terendah: " + nilaiMin + " (" + namaMin + ")");
        System.out.println("Rata-rata nilai UAS: " + nilaiMhs.hitungRataBF());
    }
}
