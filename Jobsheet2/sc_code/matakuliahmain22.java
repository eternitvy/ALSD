package sc_code;

import java.nio.channels.Pipe.SourceChannel;

public class matakuliahmain22 {
    public static void main(String[] args) {
        matakuliah22 mk1 = new matakuliah22();
        mk1.kodeMK = "ALSD";
        mk1.nama = "algoritma dan struktur data";
        mk1.sks = 3;
        mk1.jumlahjam = 6;

        mk1.tampilkaninformasi(null);
        mk1.ubahsks(2);
        System.out.println();
        mk1.tampilkaninformasi(null);
        System.out.println();

        matakuliah22 mk2 = new matakuliah22("AJB", "Aljabar", 2, 5);
        mk2.tampilkaninformasi(null);
        mk2.ubahsks(3);
        mk2.kurangjam(7);
        System.out.println();
        mk2.tampilkaninformasi(null);
    }
}
