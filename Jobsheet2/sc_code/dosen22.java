package sc_code;

public class dosen22 {
    String IDdosen;
    String nama;
    boolean statusaktif;
    int tahunbergabung;
    String bidangkeahlian;

    public dosen22() {

    }

    public dosen22(String ID, String nm, boolean status, int tahun, String keahlian) {
        IDdosen = ID;
        nama = nm;
        statusaktif = status;
        tahunbergabung = tahun;
        bidangkeahlian = keahlian;
    }

    void tampilkaninformasi() {
        System.out.println("ID dosen: " + IDdosen);
        System.out.println("nama dosen: " + nama);
        if (statusaktif == true) {
            System.out.println("status: aktif");
        }
        else {
            System.out.println("status: tidak aktif");
        }
        System.out.println("tahun bergabung: " + tahunbergabung);
        System.out.println("bidang keahlian: " + bidangkeahlian);
    }

    void setstatusdosen(boolean status) {
        statusaktif = status;
    }

    int hitungmasakerja(int tahunsekarang) {
        return tahunsekarang - tahunbergabung;
    }

    void ubahkeahlian(String bidang) {
        bidangkeahlian = bidang;
    }
}
