public class Penilaian {
    
    int indeks = 0;

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian() {
    }

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.nilaiAkhir = 0;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilPenilaian() {
        System.out.println("NIM          : " + mahasiswa.nim);
        System.out.println("Nama         : " + mahasiswa.nama);
        System.out.println("Prodi        : " + mahasiswa.prodi);
        System.out.println("Mata Kuliah  : " + mataKuliah.namaMK);
        System.out.println("Tugas        : " + nilaiTugas);
        System.out.println("UTS          : " + nilaiUTS);
        System.out.println("UAS          : " + nilaiUAS);
        System.out.println("Nilai Akhir  : " + nilaiAkhir);
        System.out.println();
    }
}