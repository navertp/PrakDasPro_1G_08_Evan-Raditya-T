package Semester2.Pertemuan13ALSD_Jobsheet12;

public class NodeFilm08 {
    int id;
    String judul;
    double rating;
    NodeFilm08 prev, next;

    public NodeFilm08(NodeFilm08 prev, int id, String judul, double rating, NodeFilm08 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
