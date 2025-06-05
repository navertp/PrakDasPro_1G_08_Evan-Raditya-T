package Semester2.Pertemuan14ALSD_CM2;

public class NodeAntrian {
    Pasien antrian;
    NodeAntrian next, prev;

    NodeAntrian (NodeAntrian prev, Pasien antrian, NodeAntrian next) {
        this.antrian=antrian;
        this.next=next;
        this.prev=prev;
    }
}