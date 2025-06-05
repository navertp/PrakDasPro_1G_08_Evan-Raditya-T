package Semester2.Pertemuan14ALSD_CM2;

public class Layanan {
    NodeAntrian front, rear;
    int size;

    Layanan () {
        front=rear=null;
        size=0;
    }

    public boolean isEmpty() {
        return front==null;
    }

    public void tambahAntrian(Pasien pasien) {
        if (isEmpty()) {
            front = rear = new NodeAntrian(null, pasien, null);
        } else {
            NodeAntrian current = front;
            while (current.next!=null) {
                current = current.next;
            }
            NodeAntrian newNodeAntrian = new NodeAntrian(current, pasien, null);
            current.next = newNodeAntrian;
            rear = newNodeAntrian;
        }
        size++;
    }

    public void tampilkanAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else {
            System.out.println("-- Antrian Pasien --");
            System.out.println("Antrian Pasien:");
            NodeAntrian temp = front;
            while (temp!=null) {
                temp.antrian.tampilkanInformasi();
                temp = temp.next;
            }
        }
    }

    public void hapusAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else if (size==1) {
            if (front.next == null) {
            front = null;
            size--;
            return;
        }
        NodeAntrian current = front;
        while (current.next != null) {
            current = current.next;
        }
        current.next = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
    }

    public int sisaAntrian () {
        return size;
    }
}
