package sc_code;
public class mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa22() {
    }

    mahasiswa22(String nim, String nama, String kelas, double ipk)  {
        this.nim = nim;
        this.nama = nama;
        this.kelas= kelas;
        this.ipk = ipk;
    }

    void tampilinformasi() {
        System.out.println("Nim   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}