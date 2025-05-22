package Semester2.Pertemuan13ALSD_Jobsheet12;

public class DLLAntriVaksin08 {
    NodeAntriVaksin08 head, tail;
    int size;

    public DLLAntriVaksin08() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(int nomor, String nama) {
        NodeAntriVaksin08 newNode = new NodeAntriVaksin08(null, nomor, nama, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void kurangiAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void print() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantre Vaksin");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.printf("|%-5s|%-15s|\n", "No.", "Nama");
        System.out.println("-------------------------------");

        if (!isEmpty()) {
            NodeAntriVaksin08 tmp = head;
            while (tmp != null) {
                System.out.printf("|%-5d|%-15s|\n", tmp.nomor, tmp.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("|      Tidak ada data         |");
        }

        System.out.println("-------------------------------");
        System.out.println("Sisa Antrian: " + size);
        System.out.println();
    }
}
