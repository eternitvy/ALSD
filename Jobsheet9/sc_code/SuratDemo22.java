package sc_code;
import java.util.Scanner;

public class SuratDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilih;
        StackSurat22 stack = new StackSurat22(5);

        do {
            System.out.println("=================== MENU ===================");
            System.out.println("| 1. Terima Surat Izin                     |");
            System.out.println("| 2. Proses Surat Izin                     |");
            System.out.println("| 3. Melihan Surat Izin Teratas            |");
            System.out.println("| 4. Cari Surat Berdasarkan Nama Mahasiswa |");
            System.out.println("============================================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.println("== Masukkan Data Surat Izin ==");
                    System.out.println();

                    System.out.print("ID Surat           : ");
                    String idSurat = sc.nextLine();

                    System.out.print("Nama Mahasiswa     : ");
                    String namaMahasiswa = sc.nextLine();

                    System.out.print("Kelas              : ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S / I) : ");
                    char jenisIzin = Character.toUpperCase(sc.next().charAt(0));
                    if (jenisIzin != 'S' && jenisIzin != 'I') {
                        System.out.println("Jenis Izin Tidak Valid!");
                        break;
                    }

                    System.out.print("Durasi Izin        : ");
                    int durasi = sc.nextInt();

                    Surat22 surat = new Surat22(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);

                    System.out.println();
                    System.out.printf("Surat %s berhasil dikumpulkan\n" , surat.namaMahasiswa);
                    System.out.println();
                    break;
            
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Tidak ada surat izin yang dikumpulkan");
                        break;
                    }
                    Surat22 diproses = stack.pop();
                    
                    System.out.println("Surat izin " + diproses.namaMahasiswa + " diproses");
                    System.out.println();
                    diproses.print();
                    System.out.println();
                    break;

                case 3:
                    Surat22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("== MENCARI SURAT IZIN ==");
                    System.out.println();

                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String dicari = sc.next();
                    System.out.println();
                    
                    stack.cariSurat(dicari.toLowerCase());
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        while (pilih >= 1 && pilih <= 4);
    }
}
