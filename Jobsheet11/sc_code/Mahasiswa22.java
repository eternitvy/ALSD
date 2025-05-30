package sc_code;

public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa22(){
    }

    public Mahasiswa22(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
