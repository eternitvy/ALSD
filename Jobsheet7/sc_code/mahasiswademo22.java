package sc_code;
import java.util.Scanner;
public class mahasiswademo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswaberprestasi22 list = new mahasiswaberprestasi22();
        // int jmlmhs = 5;

        // modifikasi pertanyaan 5, percobaan 2
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlmhs = sc.nextInt();
        sc.nextLine();
        System.out.println();

        list.initializelist(jmlmhs);

        for (int i = 0; i < jmlmhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("----------------------------------");

            list.tambah(new mahasiswa22(nim, nama, kelas, ipk));
        }

        System.out.println();
        System.out.println("-- DATA MAHASISWA --");
        System.out.println();
        list.tampil();
        System.out.println();

        System.out.println("------------------------------------");
        System.out.println("---------- PENCARIAN DATA ----------");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Masukan IPK mahasiswa yang dicari");
        System.out.print("IPK\t : ");
        double cari = sc.nextDouble();
        System.out.println();

        System.out.println("-- MENGGUNAKAN SEQUENTIAL SEARCHING --");
        double posisi = list.sequentialsearching(cari);
        int pss = (int)posisi;
        list.tampilposisi(cari, pss);
        list.tampildatasearch(cari, pss);
        System.out.println();

        System.out.println("-- MENGGUNAKAN BINARY SEARCH --");
        double posisi2 = list.findbinarysearch(cari, 0, jmlmhs-1);
        int pss2 = (int)posisi2;
        list.tampilposisi(cari, pss2);
        list.tampildatasearch(cari, pss2);

    }
}
