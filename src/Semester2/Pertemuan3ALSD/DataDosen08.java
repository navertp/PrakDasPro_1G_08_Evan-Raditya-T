package Semester2.Pertemuan3ALSD;

public class DataDosen08 {
    public void dataSemuaDosen(Dosen08[] arrayOfDosen08) {
        int indexDosen = 1;
        for (Dosen08 dosen08 : arrayOfDosen08) {
            System.out.println("Data Dosen Ke-" + indexDosen++);
            System.out.println("Kode            : " + dosen08.kode);
            System.out.println("Nama            : " + dosen08.nama);
            System.out.println("Jenis Kelamin   : " + (dosen08.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dosen08.usia);
            indexDosen++;
        }
    }

    public void jumlahDosenPerJnsKelamin(Dosen08[] arrayOfDosen08) {
        int pria = 0;
        int wanita = 0;

        for (Dosen08 dosen08 : arrayOfDosen08) {
            if (dosen08.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        
        System.out.println("Jumlah Dosen Pria     :" + pria);
        System.out.println("Jumlah Dosen Wanita :" + wanita);
    }

    public void rataRataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen08) {
        int pria = 0;
        int totalUsiaPria = 0;
        int wanita = 0;
        int totalUsiaWanita = 0;
        for (Dosen08 dosen08 : arrayOfDosen08) {
            if (dosen08.jenisKelamin) {
                totalUsiaPria += dosen08.usia;
                pria++;
            } else {
                totalUsiaWanita += dosen08.usia;
                wanita++;
            }
        }

        System.out.println("Rata-Rata usia dosen Pria     : " + (totalUsiaPria/pria));
        System.out.println("Rata-Rata usia dosen Wanita   : " + (totalUsiaWanita/wanita));

         
    }
    public void infoDosenTertua(Dosen08[] arrayOfDosen08) {
        Dosen08 dosenTertua = arrayOfDosen08[0];
        for (Dosen08 dosen08 : arrayOfDosen08) {
            if (dosen08.usia > dosenTertua.usia) {
                dosenTertua = dosen08;
            }
        }

        System.out.println("Dosen Tertua   : " +dosenTertua.nama);
        System.out.println("Usia           : " + dosenTertua.usia);
    }

    public void infoDosenTermuda(Dosen08[] arrayOfDosen08) {
        Dosen08 dosenTermuda = arrayOfDosen08[0];
        for (Dosen08 dosen08 : arrayOfDosen08) {
            if (dosen08.usia < dosenTermuda.usia) {
                dosenTermuda = dosen08;
            }
        }

        System.out.println("Dosen Termuda   : " + dosenTermuda.nama);
        System.out.println("Usia            : " + dosenTermuda.usia);
    }
}
