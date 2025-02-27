package sc_code;

public class dosenmain22 {
    public static void main(String[] args) {
        int tahun;

        dosen22 ds1 = new dosen22();
        ds1.IDdosen = "2344";
        ds1.nama = "aisya";
        ds1.statusaktif = true;
        ds1.tahunbergabung = 2020;
        ds1.bidangkeahlian = "dasar pemrograman";
        
        tahun = ds1.hitungmasakerja(2025);
        ds1.tampilkaninformasi();
        System.out.println();
        ds1.ubahkeahlian("CTPS");
        ds1.tampilkaninformasi();
        System.out.println("masa kerja dosen: " + tahun);

        System.out.println();
        dosen22 ds2 = new dosen22("2775", "nur", false, 2023, "matematika");
        ds2.tampilkaninformasi();
    }
}
