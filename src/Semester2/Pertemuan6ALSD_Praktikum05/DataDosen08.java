package Semester2.Pertemuan6ALSD_Praktikum05;

public class DataDosen08 {
    Dosen08[] dataDosen = new Dosen08[10];
    int idx;
    
    DataDosen08() {
        idx = 0;
    }
    
    DataDosen08(int jumlah) {
        dataDosen = new Dosen08[jumlah];
        idx = 0;
    }
    
    void tambah08(Dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan");
        } else {
            System.out.println("Penyimpanan penuh!");
        }
    }
    
    void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            dataDosen[i].tampil();
        }
    }
    
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen08 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen08 temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIndex];
            dataDosen[maxIndex] = temp;
        }
    }
    
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen08 key = dataDosen[i];
            int j = i - 1;
            
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }
    
    void pencarianDataSequential08(String nama) {
        boolean ditemukan = false;
        int jumlahHasil = 0;
    
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("\nData ditemukan:");
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahHasil++;
            }
        }
    
        if (!ditemukan) {
            System.out.println("\nData dengan nama '" + nama + "' tidak ditemukan.");
        } else if (jumlahHasil > 1) {
            System.out.println("\nPeringatan: Ditemukan lebih dari satu data dengan nama yang sama!");
        }
    }
    
    void pencarianDataBinary08(int usia) {
        sortingASC();
        int low = 0;
        int high = idx - 1;
        boolean ditemukan = false;
        int jumlahHasil = 0;
    
        while (low <= high) {
            int mid = (low + high) / 2;
    
            if (dataDosen[mid].usia == usia) {
                System.out.println("\nData ditemukan:");
                for (int i = mid; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampil();
                    ditemukan = true;
                    jumlahHasil++;
                }
                for (int i = mid + 1; i < idx && dataDosen[i].usia == usia; i++) {
                    dataDosen[i].tampil();
                    ditemukan = true;
                    jumlahHasil++;
                }
                break;
            }
    
            if (dataDosen[mid].usia < usia) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    
        if (!ditemukan) {
            System.out.println("\nData dengan usia '" + usia + "' tidak ditemukan.");
        } else if (jumlahHasil > 1) {
            System.out.println("\nData ditemukan lebih dari 1");
        }
    }    
}
