package Semester2.Pertemuan6ALSD_Praktkum05;

public class SortingMain08 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        Sorting08 dataurut1 = new Sorting08(a, a.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data Sudah Diurutkan Dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};

        Sorting08 dataurut2 = new Sorting08(b, b.length);

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data Sudah Diurutkan Dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c[] = {40, 10, 4, 9, 3};
        
        Sorting08 dataurut3 = new Sorting08(c, c.length);

        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.InsertionSort();
        System.out.println("Data Sudah Diurutkan Dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
