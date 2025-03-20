package Semester2.Pertemuan6ALSD_Praktikum05;

public class MahasiswaBerprestasi08 {
    Mahasiswa08 [] listMhs = new Mahasiswa08[5];
    int idx;

    MahasiswaBerprestasi08(int jumlah) {
        listMhs = new Mahasiswa08[jumlah];
        idx = 0;
    }

    public MahasiswaBerprestasi08() {
    }

    void tambah (Mahasiswa08 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah penuh");
        }
    }

    void tampil () {
        for (Mahasiswa08 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa08 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
