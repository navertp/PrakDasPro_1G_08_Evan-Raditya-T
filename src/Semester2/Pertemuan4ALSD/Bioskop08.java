package Semester2.Pertemuan4ALSD;

public class Bioskop08 {
    String namaFilm;
    int studio, jumlahKursi, kursiTerpenuhi;

    public Bioskop08(String namaFilm, int studio, int jumlahKursi, int kursiTerpenuhi) {
        this.namaFilm = namaFilm;
        this.studio = studio;
        this.jumlahKursi = jumlahKursi;
        this.kursiTerpenuhi = kursiTerpenuhi;
    }

    public void tampilInformasi() {
        System.out.println("Nama Film       : " + namaFilm);
        System.out.println("Studio          : " + studio);
        System.out.println("Jumlah Kursi    : " + jumlahKursi);
        System.out.println("Kursi Terpenuhi : " + kursiTerpenuhi);
        System.out.println("Kursi Tersisa   : " + kursiTersisa());
    }
    
    public int kursiTersisa() {
        return jumlahKursi - kursiTerpenuhi;
    }
 
    public void penuhTidak() {
        int kursiTersisa = jumlahKursi - kursiTerpenuhi;
        if (kursiTersisa == 0) {
            System.out.println("Studio " + studio + " sudah penuh!");
        } else {
            System.out.println("Masih ada " + kursiTersisa + " kursi tersedia di Studio " + studio);
        }
    }
}
