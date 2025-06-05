package Semester2.Pertemuan13ALSD_Jobsheet12;

public class DLLFilm08 {
    NodeFilm08 head, tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAwal(int id, String judul, double rating) {
        NodeFilm08 newNode = new NodeFilm08(null, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void tambahAkhir(int id, String judul, double rating) {
        NodeFilm08 newNode = new NodeFilm08(null, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void tambahDiIndex(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
        } else if (index == 0) {
            tambahAwal(id, judul, rating);
        } else if (index == size) {
            tambahAkhir(id, judul, rating);
        } else {
            NodeFilm08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            NodeFilm08 newNode = new NodeFilm08(current.prev, id, judul, rating, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void hapusPertama() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Film " + head.judul + " berhasil dihapus");
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            size--;
        }
    }

    public void hapusTerakhir() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Film " + tail.judul + " berhasil dihapus");
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
            size--;
        }
    }

    public void hapusDiIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
        } else if (index == 0) {
            hapusPertama();
        } else if (index == size - 1) {
            hapusTerakhir();
        } else {
            NodeFilm08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("Film " + current.judul + " berhasil dihapus");
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void cetak() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            NodeFilm08 current = head;
            while (current != null) {
                System.out.println("ID: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("IMDB: " + current.rating);
                System.out.println();
                current = current.next;
            }
        }
    }

    public void cariID(int id) {
        NodeFilm08 current = head;
        int posisi = 0;
        boolean ketemu = false;

        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID: " + id + " berada di node ke- " + posisi);
                System.out.println("IDENTITAS:");
                System.out.println("ID Film: " + current.id);
                System.out.println("Judul Film: " + current.judul);
                System.out.println("IMDB Rating: " + current.rating);
                ketemu = true;
                break;
            }
            posisi++;
            current = current.next;
        }

        if (!ketemu) {
            System.out.println("Data dengan ID " + id + " tidak ditemukan");
        }
    }

    public void urutRatingDESC() {
        if (isEmpty()) return;

        for (NodeFilm08 i = head; i != null; i = i.next) {
            NodeFilm08 max = i;
            for (NodeFilm08 j = i.next; j != null; j = j.next) {
                if (j.rating > max.rating) {
                    max = j;
                }
            }

            if (max != i) {
                int tempId = i.id;
                String tempJudul = i.judul;
                double tempRating = i.rating;

                i.id = max.id;
                i.judul = max.judul;
                i.rating = max.rating;

                max.id = tempId;
                max.judul = tempJudul;
                max.rating = tempRating;
            }
        }
    }
}
