package sc_code;

public class LatMhs {
    String nim;
    String nama;
    String kelas;

    public LatMhs() {
    }

    public LatMhs(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas);
    }
}
