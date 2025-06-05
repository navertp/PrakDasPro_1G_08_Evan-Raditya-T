package Semester2.Pertemuan14ALSD_CM2;

public class Pasien {
    String nama, nik, keluhan;
    
    Pasien (String nama, String nik, String keluhan) {
        this.nama=nama;
        this.nik=nik;
        this.keluhan=keluhan;
    }

    public void tampilkanInformasi () {
        System.out.println("Nama pasien: "+nama);
        System.out.println("NIK: "+nik);
        System.out.println("Keluhan: "+keluhan);
    }
}