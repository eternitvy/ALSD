package sc_code;
import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        
        // Mahasiswa22 m1 = new Mahasiswa22("123", "Zidan", "2A", 3.2);
        // Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
        // Mahasiswa22 m3 = new Mahasiswa22("125", "Sofi", "2A", 3.1);
        // Mahasiswa22 m4 = new Mahasiswa22("126", "Sita", "2A", 3.9);
        // Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);
        
        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
        
        // PERTANYAAN NO.2 (PERCOBAAN 2)
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();
        System.out.println();

        list.initializelist(jmlMhs);

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa22 m = new Mahasiswa22(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println("----------------------------------");
        }
        
        System.out.println();
        System.out.println("-- DATA MAHASISWA SEBELUM SORTING --");
        list.tampil();
        System.out.println();

        System.out.println("-- DATA MAHASISWA SETELAH SORTING BERDASARKAN IPK (DESC) --");
        list.bubbleSort();
        list.tampil();
        System.out.println();

        System.out.println("-- DATA MAHASISWA SETELAH SORTING SELECTION SORT (ASC) --");
        list.SelectionSort();
        list.tampil();
        System.out.println();

        System.out.println("-- DATA MAHASISWA SETELAH SORTING INSERTION SORT (ASC) --");
        list.insertionSort();
        list.tampil();

    }
}
