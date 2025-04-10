package sc_code;
public class SortingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting22 dataurut1 = new Sorting22(a, a.length);

        System.out.println("---------------------------------------------");
        System.out.println("-- DATA AWAL 1 --");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println("---------------------------------------------");
        
        int b[] = {30, 20,2, 8, 14};
        Sorting22 dataurut2 = new Sorting22(b, b.length);
        
        System.out.println("-- DATA AWAL 2 --");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
        System.out.println("---------------------------------------------");
        
        int c[] = {40, 10, 4, 9, 3};
        Sorting22 dataurut3 = new Sorting22(c, c.length);
        
        System.out.println("-- DATA AWAL 3 --");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
        System.out.println("---------------------------------------------");
    }
}
