import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataMahasiswa DM = new DataMahasiswa();
        DataMataKuliah DMK = new DataMataKuliah();
        DataPenilaian DP = new DataPenilaian();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman", "TI");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso", "TI");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi", "TI");
        
        DM.tambah(m1);
        DM.tambah(m2);
        DM.tambah(m3);
        
        MataKuliah mataKuliah = new MataKuliah();
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Design Web", 2);
        
        DMK.tambah(mk1);
        DMK.tambah(mk2);
        DMK.tambah(mk3);
        
        Penilaian penilaian = new Penilaian();
        Penilaian p1 = new Penilaian(m1, mk1, 80, 85, 90);
        Penilaian p2 = new Penilaian(m1, mk2, 80, 85, 90);
        Penilaian p3 = new Penilaian(m2, mk1, 75, 70, 80);
        Penilaian p4 = new Penilaian(m3, mk2, 85, 90, 95);
        Penilaian p5 = new Penilaian(m3, mk3, 80, 90, 65);
        
        DP.tambah(p1);
        DP.tambah(p2);
        DP.tambah(p3);
        DP.tambah(p4);
        DP.tambah(p5);
        
        int pilihan;
        
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("| 1. Tampilkan Data Mahasiswa                        |");
            System.out.println("| 2. Tampilkan Data Mata Kuliah                      |");
            System.out.println("| 3. Tampilkan Data Penilaian                        |");
            System.out.println("| 4. Urutan Mahasiswa Berdasarkan Nilai Akhir        |");
            System.out.println("| 5. Cari Data Penilaian Mahasiswa Berdasarkan NIM   |");
            System.out.println("| 6. Tampilkan Jumlah Mahasiswa Berdasarkan Nilai    |");
            System.out.println("| 7. Keluar                                          |");
            System.out.println("------------------------------------------------------");
            System.out.println();
            System.out.print("Pilih Opsi: ");
            pilihan = sc.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("=== DATA MAHASISWA ===");
                    System.out.println();
                    DM.tampilDataMhs();
                    break;

                case 2:
                    System.out.println("=== DATA MATA KULIAH ===");
                    System.out.println();
                    DMK.tampilDataMK();
                    break;

                case 3:
                    System.out.println("=== DATA PENILAIAN MAHASISWA ===");
                    System.out.println();
                    DP.tampilDataNilai();
                    break;

                case 4:
                    System.out.println("=== DATA MAHASISWA BERDASARKAN NILAI AKHIR (DESC) ===");
                    System.out.println();
                    DP.urutanNilaiAkhir();
                    DP.tampilDataNilai();
                    break;

                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nim = sc.next();
                    System.out.println();
                    DP.cariDataPenilaianBerdasarkanNim(nim);
                    break;

                case 6:

                    System.out.println("=== JUMLAH MAHASISWA BERDASARKAN NILAI ===");
                    System.out.println();
                    DP.jumlahNilaiMhs();
                
                case 7:
                    System.out.println("Program Selesai.");
                    break;
                
                default:
                    System.out.println("Pilihan Invalid!");
            }

            System.out.println();

        }
        while (pilihan != 7);
        sc.close();
    }
}