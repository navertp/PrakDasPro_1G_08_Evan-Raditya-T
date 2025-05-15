package Semester2.Pertemuan12ALSD_Jobsheet11;

public class QueueKemahasiswaan08 {
    NodeKemahasiswaan08 front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Kemahasiswaan08 k) {
        NodeKemahasiswaan08 newNode = new NodeKemahasiswaan08(k);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil");
        } else {
            System.out.print("Dipanggil : ");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan : ");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir : ");
            rear.data.tampil();
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeKemahasiswaan08 temp = front;
            System.out.println("Daftar antrian :");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
