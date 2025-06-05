package Semester2.Pertemuan15ALSD_Jobsheet14;

public class BinaryTreeArrayMain08 {
    public static void main(String[] args) {
        BinaryTreeArray08 bta = new BinaryTreeArray08();
        Mahasiswa08 mhs1 = new Mahasiswa08("244160121", "Ali", "A", 3.57);
        Mahasiswa08 mhs2 = new Mahasiswa08("244160185", "Candra", "C", 3.41);
        Mahasiswa08 mhs3 = new Mahasiswa08("244160221", "Badar", "B", 3.75);
        Mahasiswa08 mhs4 = new Mahasiswa08("244160220", "Dewi", "B", 3.35);
        Mahasiswa08 mhs5 = new Mahasiswa08("244160131", "Devi", "A", 3.48);
        Mahasiswa08 mhs6 = new Mahasiswa08("244160205", "Ehsan", "D", 3.61);
        Mahasiswa08 mhs7 = new Mahasiswa08("244160170", "Fizi", "B", 3.86);

        Mahasiswa08[] dataMahasiswa = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa,idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPreOrder Traversal Mahasiswa:");
        bta.traversePreOrder(0);

        bta.add(new Mahasiswa08("244160222", "Adi", "C", 3.59));
        System.out.println("\nMahasiswa Ditambahkan");

        System.out.println("\nInOrder Traversal Setelah Penambahan:");
        bta.traverseInOrder(0);
    }
}
