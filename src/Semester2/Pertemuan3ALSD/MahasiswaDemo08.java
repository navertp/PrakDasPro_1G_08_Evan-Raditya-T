package Semester2.Pertemuan3ALSD;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Mahasiswa08[] arrayOfMahasiswa08 = new Mahasiswa08[3];
        arrayOfMahasiswa08[0] = new Mahasiswa08 ();
        arrayOfMahasiswa08[0].nim = "244107060033";
        arrayOfMahasiswa08[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa08[0].kelas = "SIB-1E";
        arrayOfMahasiswa08[0].ipk = (float) 3.75;

        arrayOfMahasiswa08[1] = new Mahasiswa08();
        arrayOfMahasiswa08[1].nim = "2341720172";
        arrayOfMahasiswa08[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa08[1].kelas = "TI-2A";
        arrayOfMahasiswa08[1].ipk = (float) 3.36;

        arrayOfMahasiswa08[2] = new Mahasiswa08();
        arrayOfMahasiswa08[2].nim = "244107023006";
        arrayOfMahasiswa08[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa08[2].kelas = "TI-2E";
        arrayOfMahasiswa08[2].ipk = (float) 3.80;

        System.out.println("NIM   : " + arrayOfMahasiswa08[0].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa08[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa08[0].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa08[0].ipk);
        System.out.println("--------------------------------");
        
        System.out.println("NIM   : " + arrayOfMahasiswa08[1].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa08[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa08[1].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa08[1].ipk);
        System.out.println("--------------------------------");
        
        System.out.println("NIM   : " + arrayOfMahasiswa08[2].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa08[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa08[2].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa08[2].ipk);
        System.out.println("--------------------------------");
    }
}
