public class LaporanKeuanganMain {
    public static void main(String[] args) {
        LaporanKeuangan[] arrayObjek = new LaporanKeuangan[5];
        String namaPerusahaan;
        double pendapatanBulanan;
        double biayaOperasional;

        arrayObjek[0] = new LaporanKeuangan("Perusahaan 1", 89000, 50000);
        arrayObjek[1] = new LaporanKeuangan("Perusahaan 2", 150000, 90000);
        arrayObjek[2] = new LaporanKeuangan("Perusahaan 3", 200000, 100000);
        arrayObjek[3] = new LaporanKeuangan("Perusahaan 4", 80000, 70000);
        arrayObjek[4] = new LaporanKeuangan("Perusahaan 5", 130000, 100000);

        System.out.println();
        System.out.println("---------- DAFTAR DATA PERUSAHAAN ----------");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            arrayObjek[i].printData();
            System.out.println("------------------------------------------");

        }

        System.out.println();
        System.out.println("---------- KEUNTUNGAN PERUSAHAAN ----------");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Keuntungan Perusahaan " + (i + 1) + ": ");
            arrayObjek[i].hitungKeuntungan();
            System.out.println();
            
        }

        int jmlpendapatan = 0;

        if (pendapatanBulanan > 100000) {
            jmlpendapatan += 1;
            
        }

        for (int i = 0; i < 5; i++) {
            arrayObjek[i].hitungJumlahPerusahaanLebihDari1000000();    
        }

        for (int i = 0; i < 5; i++) {
            arrayObjek[i].hitungRatarata();
            System.out.println("rata rata: ");
        }
        
        
    }
}
