package sc_code;

public class mahasiswamain22 {
    public static void main(String[] args) {
        mahasiswa22 mhs1 = new mahasiswa22();
        mhs1.nama = "muhammad ali farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkaninformasi(null);
        mhs1.ubahkelas("SI 2J");
        mhs1.updateipk(3.60);
        mhs1.tampilkaninformasi(null);

        mahasiswa22 mhs2 = new mahasiswa22("annisa nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateipk(3.30);
        mhs2.tampilkaninformasi(null);

        mahasiswa22 mhsabl = new mahasiswa22("Regita Abelia Putri Satriyo", "244107020173", 3.54, "TI-1H");
    }
}
 