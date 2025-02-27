package sc_code;

public class matakuliah22 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    public matakuliah22 () {

    }

    public matakuliah22 (String kode, String nm, int sks, int jmljam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahjam = jmljam;
    }

    void tampilkaninformasi(String kelasbaru) {
        System.out.println("kode mata kuliah: " + kodeMK);
        System.out.println("nama mata kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("jumlah jam: " + jumlahjam);
    }

    void ubahsks(int sksbaru) {
        if (sksbaru != sks) {
            sks = sksbaru;
            System.out.println("sks telah diubah.");
        }
    }

    void tambahjam(int jambaru) {
        if (jambaru > 0) {
            jumlahjam += jambaru;
            System.out.println("jam telah diubah");
        }
    }

    void kurangjam(int jambaru) {
        if (jambaru == jumlahjam || jambaru > jumlahjam) {
            System.out.println("perubahan jam tidak valid!");
            System.out.println();
        } 
        else if (jambaru < jumlahjam || jambaru != 0) {
            jumlahjam -= jambaru;
            System.out.println("jam telah diubah");
            System.out.println();
        }
        else {
            System.out.println();
        }
    }
}
    
