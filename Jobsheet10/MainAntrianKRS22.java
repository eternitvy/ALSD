import java.util.Scanner;

public class MainAntrianKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LatihanAntrianKRS22 antrian = new LatihanAntrianKRS22();
        int pilih;

        do {
            System.out.println("========================= MENU =========================");
            System.out.println("| 1. Tambah Mahasiswa                                  |");
            System.out.println("| 2. Layani Mahasiswa                                  |");
            System.out.println("| 3. Tampilkan Semua Antrian                           |");
            System.out.println("| 4. Lihat 2 Mahasiswa Terdepan                        |");
            System.out.println("| 5. Lihat Mahasiswa Terakhir                          |");
            System.out.println("| 6. Jumlah Mahasiswa dalam Antrian                    |");
            System.out.println("| 7. Jumlah Mahasiswa yang Sudah Melakukan Proses KRS  |");
            System.out.println("| 8. Jumlah Mahasiswa yang Belum Melakukan Proses KRS  |");
            System.out.println("| 9. Kosongkan Antrian                                 |");
            System.out.println("| 0. Keluar                                            |");
            System.out.println("========================================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    LatihanMahasiswa22 mhs = new LatihanMahasiswa22(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    System.out.println();
                    break;
            
                case 2:
                    LatihanMahasiswa22[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("== MELAYANI MAHASISWA ==");
                        System.out.println();
                        dilayani[0].tampilkanData();
                        dilayani[1].tampilkanData();
                        System.out.println();
                    }
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    System.out.println();
                    break;

                case 4:
                    antrian.lihatDuaDepan();
                    System.out.println();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    System.out.println();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    System.out.println();
                    break;

                case 7:
                    antrian.sudahProses();
                    System.out.println();
                    break;

                case 8:
                    antrian.belumProses();
                    System.out.println();
                    break;

                case 9:
                    antrian.clear();
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Program Selesai");

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih >= 0);
    }
}
