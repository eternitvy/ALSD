public class LaporanKeuangan {
    String namaPerusahaan;
    double pendapatanBulanan;
    double biayaOperasional;

    public LaporanKeuangan(String namaPerusahaan, double pendapatanBulanan, double biayaOperasional) {
        this.namaPerusahaan = namaPerusahaan;
        this.pendapatanBulanan = pendapatanBulanan;
        this.biayaOperasional = biayaOperasional;
    }

    void hitungKeuntungan() {
        double keuntungan = pendapatanBulanan - biayaOperasional;
        System.out.print(keuntungan);
    }

    void printData() {
        System.out.println("Nama Perusahaan: " + namaPerusahaan);
        System.out.println("Pendapatan Bulanan: " + pendapatanBulanan);
        System.out.println("Biaya Operasional: " + biayaOperasional);
    }

    void hitungJumlahPerusahaanLebihDari1000000() {
        int jmlpendapatan = 0;

        if (pendapatanBulanan > 100000) {
            jmlpendapatan += 1;
            
        }
    }

    void hitungRatarata() {
        int ratarata = 0;
        int jmlpendapatan = 0;
        int hasil = 0;

        if (pendapatanBulanan > 100000) {
            ratarata += pendapatanBulanan;
        }
        hasil = ratarata / jmlpendapatan;
    }
}



