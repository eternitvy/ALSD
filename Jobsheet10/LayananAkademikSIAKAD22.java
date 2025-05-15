import java.util.Scanner;

public class LayananAkademikSIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianLayanan22 antrian = new AntrianLayanan22(5);
        int pilih;

        do {
            System.out.println("================ MENU ================");
            System.out.println("| 1. Tambah Mahasiswa ke Antrian     |");
            System.out.println("| 2. Layani Mahasiswa                |");
            System.out.println("| 3. Lihat Mahasiswa Terdepan        |");
            System.out.println("| 4. Lihat Semua Antrian             |");
            System.out.println("| 5. Jumlah Mahasiswa dalam Antrian  |");
            System.out.println("| 0. Keluar                          |");
            System.out.println("======================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.println("== MASUKKAN DATA MAHASISWA ==");
                    System.out.println();
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("== LAYANI MAHASISWA ==");
                    System.out.println();
                    Mahasiswa22 dilayani  = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    System.out.println();
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    System.out.println();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("== JUMLAH LAYANAN ==");
                    System.out.println();
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    System.out.println();
                    break;
                
                case 0:
                    System.out.println("Terima kasih.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        }
        while (pilih != 0);
    }
}
