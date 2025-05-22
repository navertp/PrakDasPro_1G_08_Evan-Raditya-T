package Semester2.Pertemuan13ALSD_Jobsheet12;

public class NodeAntriVaksin08 {
    String nama;
    int nomor;
    NodeAntriVaksin08 prev, next;

    NodeAntriVaksin08(NodeAntriVaksin08 prev, int nomor, String nama, NodeAntriVaksin08 next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
