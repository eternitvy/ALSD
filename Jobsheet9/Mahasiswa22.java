public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa22(){
    }

    public Mahasiswa22(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai; 
    }
}