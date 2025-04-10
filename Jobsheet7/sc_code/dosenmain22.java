package sc_code;
import java.util.Scanner;
public class dosenmain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        datadosen22 datadosen = new datadosen22();
        int pilihan;

        do {
            System.out.println("---------------------------------");
            System.out.println("| 1. Tambah Data Dosen          |");
            System.out.println("| 2. Tampilkan Data Dosen       |");
            System.out.println("| 3. Sorting Ascending (usia)   |");
            System.out.println("| 4. Sorting Descending (usia)  |");
            System.out.println("| 5. Cari Data Berdasarkan Nama |");
            System.out.println("| 6. Cari Data Berdasarkan Usia |");
            System.out.println("| 7. Keluar                     |");
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
                    
                    dosen22 dosen = new dosen22(kode, nama, jenisKelamin, usia);
                    datadosen.tambah(dosen);
                    break;
                
                case 2:
                    datadosen.tampil();
                    break;
                
                case 3:
                    System.out.println("-- DATA DOSEN TERURUT SECARA ASCENDING --");
                    datadosen.ascending();
                    datadosen.tampil();
                    break;

                case 4:
                    System.out.println("-- DATA DOSEN TERURUT SECARA DESCENDING --");
                    datadosen.descending();
                    datadosen.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan Nama Dosen Yang Dicari: ");
                    String carinama = sc.next();
                    System.out.println();
                    datadosen.pencariandatasequential22(carinama);
                    break;
                
                case 6:
                    System.out.print("Masukkan Usia Dosen Yang Dicari: ");
                    int cariusia = sc.nextInt();
                    System.out.println();
                    datadosen.pencariandatabinary22(cariusia);
                    break;

                case 7:
                    System.out.println("Program Selesai.");
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!");
            }

            System.out.println();

        }
        while (pilihan != 7);
    }
}