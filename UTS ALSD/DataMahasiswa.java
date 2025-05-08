public class DataMahasiswa {
    Mahasiswa[] listMhs = new Mahasiswa[3];
    int idx;
    Mahasiswa DM = new Mahasiswa();
    
    void initializelist(int size) {
        listMhs = new Mahasiswa[size];
    }

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataMhs() {
        for (Mahasiswa m:listMhs) {
            m.tampilMahasiswa();
            System.out.println();
        }
    }
}
