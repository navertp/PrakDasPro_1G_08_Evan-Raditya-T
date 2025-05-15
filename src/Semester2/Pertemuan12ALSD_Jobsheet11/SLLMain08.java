package Semester2.Pertemuan12ALSD_Jobsheet11;

import java.util.Scanner;

public class SLLMain08 {
    public static Mahasiswa08 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa08(nim, nama, kelas, ipk);
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.println("Masukkan data 4 Mahasiswa:");
        System.out.println("Data untuk mhs1:");
        Mahasiswa08 mhs1 = inputMahasiswa(sc);
        System.out.println("Data untuk mhs2:");
        Mahasiswa08 mhs2 = inputMahasiswa(sc);
        System.out.println("Data untuk mhs3:");
        Mahasiswa08 mhs3 = inputMahasiswa(sc);
        System.out.println("Data untuk mhs4:");
        Mahasiswa08 mhs4 = inputMahasiswa(sc);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
