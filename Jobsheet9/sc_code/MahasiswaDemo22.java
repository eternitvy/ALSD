package sc_code;
import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);
        int pilih;

        do {
            System.out.println("============ MENU ============");
            System.out.println("| 1. Mengumpulkan Tugas     |");
            System.out.println("| 2. Menilai Tugas          |");
            System.out.println("| 3. Melihat Tugas Teratas  |");
            System.out.println("| 4. Melihat Tugas Terbawah |");
            System.out.println("| 5. Meiihat Daftar Tugas   |");
            System.out.println("| 6. Lihat Jumlah Tugas     |");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n" , mhs.nama);
                    System.out.println();
                    break;
            
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "  + dinilai.nama);
                        System.out.print("Masukkan nilai (0 - 100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.println();
                        System.out.printf("Nilai Tugas %s adalah %d\n" , dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    System.out.println();
                    break;

                case 3:
                    Mahasiswa22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    System.out.println();
                    break;

                case 4:
                    Mahasiswa22 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("== DAFTAR SEMUA TUGAS ==");
                    System.out.println();
                    System.out.println("Nama\tNIM\tKelas");
                    System.out.println();
                    stack.print();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Jumlah Tugas yang telah dikumpulkan: " + stack.count());
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        while (pilih >= 1 && pilih <= 6);
    }
}
