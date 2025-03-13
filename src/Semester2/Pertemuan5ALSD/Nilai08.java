package Semester2.Pertemuan5ALSD;

public class Nilai08 {
    String[] nama;
    int[] uts;
    int[] uas;

    Nilai08(String[] nama, int[] uts, int[] uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }

    int cariMaxDC(int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int maxKiri = cariMaxDC(l, mid);
        int maxKanan = cariMaxDC(mid + 1, r);
        return Math.max(maxKiri, maxKanan);
    }

    int cariMinDC(int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int minKiri = cariMinDC(l, mid);
        int minKanan = cariMinDC(mid + 1, r);
        return Math.min(minKiri, minKanan);
    }

    double hitungRataBF() {
        int total = 0;
        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }
        return (double) total / uas.length;
    }

    String cariNama(int nilai) {
        for (int i = 0; i < uts.length; i++) {
            if (uts[i] == nilai) {
                return nama[i];
            }
        }
        return "Tidak ditemukan";
    }

}
