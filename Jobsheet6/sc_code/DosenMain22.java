package sc_code;
import java.util.Scanner;
public class DosenMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataDosen22 dataDosen = new DataDosen22();
        int pilihan;

        do {
            System.out.println("---------------------------------");
            System.out.println("| 1. Tambah Data Dosen          |");
            System.out.println("| 2. Tampilkan Data Dosen       |");
            System.out.println("| 3. Sorting Ascending (usia)   |");
            System.out.println("| 4. Sorting Descending (usia)  |");
            System.out.println("| 5. Keluar                     |");
            System.out.println("---------------------------------");
            System.out.println();
            System.out.print("Pilih Opsi: ");
            pilihan = sc.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.next();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama  = sc.next();
                    System.out.println("Masukkan Jenis Kelamin");
                    System.out.print("True (Laki-laki) / False (Perempuan): ");
                    boolean jenisKelamin = sc.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    
                    Dosen22 dosen = new Dosen22(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosen);
                    break;
                
                case 2:
                    dataDosen.tampil();
                    break;
                
                case 3:
                    System.out.println("-- DATA DOSEN TERURUT SECARA ASCENDING --");
                    dataDosen.ascending();
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("-- DATA DOSEN TERURUT SECARA DESCENDING --");
                    dataDosen.descending();
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.println("Program Selesai");
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!");
            }

            System.out.println();

        }
        while (pilihan != 5);
    }
}
