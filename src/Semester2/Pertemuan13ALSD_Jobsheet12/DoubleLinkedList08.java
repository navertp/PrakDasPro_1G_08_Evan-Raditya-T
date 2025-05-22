package Semester2.Pertemuan13ALSD_Jobsheet12;

public class DoubleLinkedList08 {
    Node08 head;
    int size;

    public DoubleLinkedList08() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node08(null, item, null);
        } else {
            Node08 newNode08 = new Node08(null, item, head);
            head.prev = newNode08;
            head = newNode08;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node08 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node08 newnNode08 = new Node08(current, item, null);
            current.next = newnNode08;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node08 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node08 newNode = new Node08(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node08 newNode = new Node08(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node08 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
