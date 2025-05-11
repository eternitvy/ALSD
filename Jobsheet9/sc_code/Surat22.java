package sc_code;
public class Surat22 {
    String idSurat;
    String namaMahasiswa;
    String Kelas;
    char jenisIzin;
    int durasi;

    public Surat22() {
    }

    public Surat22(String idSurat, String namaMahasiswa, String Kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.Kelas = Kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void print() {
        System.out.println("=============================");
        System.out.println("ID Surat         : " + idSurat);
        System.out.println("Nama Mahasiswa   : " + namaMahasiswa);
        System.out.println("Kelas            : " + Kelas);
        System.out.println("Jenis Izin       : " + jenisIzin);
        System.out.println("Durani           : " + durasi);
        System.out.println("===============================");
    }
}
