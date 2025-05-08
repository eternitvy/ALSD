public class DataMataKuliah {
    MataKuliah[] listMK = new MataKuliah[3];
    int idx;
    MataKuliah DMK = new MataKuliah();

    void initializelist(int size) {
        listMK = new MataKuliah[size];
    }

    void tambah(MataKuliah mk) {
        if (idx < listMK.length) {
            listMK[idx] = mk;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataMK() {
        for (MataKuliah mk : listMK) {
            mk.tampilMatakuliah();
            System.out.println();
        }
    }
}
