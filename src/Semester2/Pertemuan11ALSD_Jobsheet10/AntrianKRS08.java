package Semester2.Pertemuan11ALSD_Jobsheet10;

public class AntrianKRS08 {
    Mahasiswa08[] data;
    int front, rear, size, max;
    int jumlahProses;

    public AntrianKRS08(int n) {
        max = n;
        data = new Mahasiswa08[max];
        size = 0;
        front = rear = -1;
        jumlahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa08 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup untuk proses 2 mahasiswa");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa08 mhs = data[front];
            System.out.println("Mahasiswa ke-" + (i + 1));
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahProses++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Isi antrian:");
            int i = front;
            while (i != rear) {
                data[i].tampilkanData();
                System.out.println("-----------------");
                i = (i + 1) % max;
            }
            data[i].tampilkanData();
            System.out.println("Jumlah antrian saat ini: " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Dua mahasiswa terdepan:");
            for (int i = 0; i < 2 && i < size; i++) {
                int idx = (front + i) % max;
                data[idx].tampilkanData();
                System.out.println("-----------------");
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terakhir di antrian:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void infoJumlah() {
        System.out.println("Jumlah antrian saat ini: " + size);
        System.out.println("Jumlah yang sudah diproses KRS: " + jumlahProses);
        System.out.println("Sisa mahasiswa yang belum proses KRS: " + (30 - jumlahProses));
    }
}
