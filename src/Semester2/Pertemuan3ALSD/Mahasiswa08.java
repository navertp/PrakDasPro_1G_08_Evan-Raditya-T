package Semester2.Pertemuan3ALSD;

public class Mahasiswa08 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i+1));
            System.out.println("NIM   : " + nim);
            System.out.println("Nama  : " + nama);
            System.out.println("Kelas : " + kelas);
            System.out.println("IPK   : " + ipk);
            System.out.println("--------------------------------");
        }
    }
}   
