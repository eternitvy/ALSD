public class KRS22 {
    String nama;
    String nim;
    String prodi;
    String kelas;

    public KRS22() {
    }
    
    public KRS22(String nama, String nim, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
