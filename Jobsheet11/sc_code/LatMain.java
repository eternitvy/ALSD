package sc_code;
import java.util.Scanner;

public class LatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan maksimal jumlah antrian: ");
        int jml = sc.nextInt();
        LatAntrianLayanan antrian = new LatAntrianLayanan(jml);

        int pilih;
        do {
            System.out.println();
            System.out.println("=============== MENU ===============");
            System.out.println("| 1. Tambah Mahasiswa              |");
            System.out.println("| 2. Layani Mahasiswa              |");
            System.out.println("| 3. Tampilkan Seluruh Antrian     |");
            System.out.println("| 4. Tampilkan Antrian Terdepan    |");
            System.out.println("| 5. Tampilkan Antrian Terakhir    |");
            System.out.println("| 6. Cek Jumlah Antrian            |");
            System.out.println("| 7. Cek Antrian Penuh             |");
            System.out.println("| 8. Cek Antrian Kosong            |");
            System.out.println("| 9. Kosongkan Antrian             |");
            System.out.println("| 0. Keluar                        |");
            System.out.println("====================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh! Tidak dapat menambahkan data");
                        break;
                    }
                    System.out.println("== TAMBAH MAHASISWA ==");
                    System.out.println();
                    System.out.print("Masukkan nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Kelas  : ");
                    String kelas = sc.nextLine();
                    
                    LatMhs mhs = new LatMhs(nim, nama, kelas);
                    antrian.tambah(mhs);
                    break;
            
                case 2:
                    System.out.println("== MELAYANI 1 MAHASISWA ==");
                    System.out.println();
                    antrian.layaniMahasiswa();
                    break;

                case 3:
                    System.out.println("== SELURUH DATA ANTRIAN ==");
                    System.out.println();
                    System.out.println("Nama\tNIM \tKelas");
                    System.out.println();
                    antrian.print();
                    break;

                case 4:
                    System.out.println("== ANTRIAN TERDEPAN ==");
                    System.out.println();
                    antrian.lihatTerdepan();
                    break;

                case 5:
                    System.out.println("== ANTRIAN TERAKHIR ==");
                    System.out.println();
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getCurrentSize());
                    break;

                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;

                case 8:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian penuh");
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        while (pilih >= 0);
    }    
}
