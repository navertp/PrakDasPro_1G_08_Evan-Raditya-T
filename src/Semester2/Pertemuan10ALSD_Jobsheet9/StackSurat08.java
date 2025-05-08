package Semester2.Pertemuan10ALSD_Jobsheet9;

public class StackSurat08 {
    Surat08[] stack;
    int top;
    int size;

    public StackSurat08(int size) {
        this.size = size;
        this.stack = new Surat08[size];
        this.top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat08 surat08) {
        if (!isFull()) {
            top++;
            stack[top] = surat08;
        } else {
            System.out.println("Stack Penuh! Tidak Bisa Menambahkan Surat Lagi");
        }
    }

    public Surat08 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack Kosong! Tidak ada Surat Izin yang perlu diproses");
            return null;
        }
    }

    public Surat08 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Surat Izin masuk");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" +
                    stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan : ");
                System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" +
                        stack[i].jenisIzin + "\t" + stack[i].durasi);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan");
        }
    }
}
