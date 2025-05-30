package sc_code;
import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList22 sll = new SingleLinkedList22();
        int pilih;

        do {
            System.out.println("====================== MENU ======================");
            System.out.println("| 1. Tambah Mahasiswa di Awal                    |");
            System.out.println("| 2. Tambah Mahasiswa di Akhir                   |");
            System.out.println("| 3. Tambah Mahasiswa Setelah Nama Tertentu      |");
            System.out.println("| 4. Tambah Mahasiswa di Indeks Tertentu         |");
            System.out.println("| 5. Tampilkan Daftar Mahasiswa                  |");
            System.out.println("| 0. Keluar                                      |");
            System.out.println("==================================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    sll.addFirst(inputMhs(sc));   
                    System.out.println();                 
                    break;
            
                case 2:
                    sll.addLast(inputMhs(sc));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("== CARI NAMA ==");
                    System.out.println();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, inputMhs(sc));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("== CARI INDEKS ==");
                    System.out.println();
                    System.out.print("Masukkan indeks: ");
                    int indeksTambah = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(indeksTambah, inputMhs(sc));
                    System.out.println();
                    break;

                case 5:
                    System.out.println("== DAFTAR MAHASISWA ==");
                    System.out.println();
                    sll.print();
                    break;

                default:
                    break;
            }
        }
        while (pilih >= 0);

    } 
    public static Mahasiswa22 inputMhs(Scanner sc) {
        System.out.print("NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Nama   : ");
        String nama = sc.nextLine();
        System.out.print("Kelas  : ");
        String kelas = sc.nextLine();
        System.out.print("IPK    : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa22(nim, nama, kelas, ipk);
    }
}
